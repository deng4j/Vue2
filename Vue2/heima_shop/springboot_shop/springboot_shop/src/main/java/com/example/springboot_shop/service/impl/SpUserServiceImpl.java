package com.example.springboot_shop.service.impl;

import cn.hutool.crypto.digest.DigestUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot_shop.common.ServiceException;
import com.example.springboot_shop.domain.SpUser;
import com.example.springboot_shop.domain.VO.SpUserVO;
import com.example.springboot_shop.mapper.SpUserMapper;
import com.example.springboot_shop.service.ISpUserService;
import com.example.springboot_shop.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpUserServiceImpl extends ServiceImpl<SpUserMapper, SpUser> implements ISpUserService {

    @Autowired
    private SpUserMapper spUserMapper ;

    @Override
    public List<SpUser> queryList(SpUser spUser) {
        return this.list();
    }


    @Override
    public SpUser getSpUserById(Long id) {
        return this.getById(id);
    }

    @Override
    public Boolean addSpUser(SpUser SpUser) {
        return this.save(SpUser);
    }

    @Override
    public Boolean updateSpUser(SpUser SpUser) {
        return this.updateById(SpUser);
    }

    @Override
    public Boolean deleteSpUserByIds(Long[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }

    @Override
    public SpUserVO login(SpUser spUser) {
        if (spUser==null){
            throw new ServiceException("用户信息错误");
        }
        String md5Pwd = DigestUtil.md5Hex(spUser.getPassword());

        SpUser user = this.lambdaQuery().eq(SpUser::getUsername, spUser.getUsername())
                .eq(SpUser::getPassword, md5Pwd)
                .one();
        if (user==null){
            throw new ServiceException("该用户不存在");
        }
        Map<String, Object> map=new HashMap<>();
        map.put("id",user.getUserId());
        map.put("username",user.getUsername());
        String token = JwtUtils.getToken(map);
        SpUserVO spUserVO = new SpUserVO()
                .setId(user.getUserId())
                .setRid(30L)
                .setEmail(user.getUserEmail())
                .setUsername(user.getUsername())
                .setMobile(user.getUserTel())
                .setToken(token);
        return spUserVO;
    }
}
