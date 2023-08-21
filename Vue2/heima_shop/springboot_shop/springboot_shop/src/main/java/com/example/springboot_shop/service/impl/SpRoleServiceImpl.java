package com.example.springboot_shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot_shop.domain.SpRole;
import com.example.springboot_shop.mapper.SpRoleMapper;
import com.example.springboot_shop.service.ISpRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpRoleServiceImpl extends ServiceImpl<SpRoleMapper, SpRole> implements ISpRoleService {

    @Autowired
    private SpRoleMapper spRoleMapper ;

    @Override
    public List<SpRole> queryList(SpRole spRole) {
        return this.list();
    }


    @Override
    public SpRole getSpRoleById(Long id) {
        return this.getById(id);
    }

    @Override
    public Boolean addSpRole(SpRole SpRole) {
        return this.save(SpRole);
    }

    @Override
    public Boolean updateSpRole(SpRole SpRole) {
        return this.updateById(SpRole);
    }

    @Override
    public Boolean deleteSpRoleByIds(Long[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }
}
