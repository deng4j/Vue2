package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.domain.SpPermissionApi;
import com.example.springboot_shop.mapper.SpPermissionApiMapper;
import com.example.springboot_shop.service.ISpPermissionApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpPermissionApiServiceImpl extends ServiceImpl<SpPermissionApiMapper, SpPermissionApi> implements ISpPermissionApiService {

    @Autowired
    private SpPermissionApiMapper spPermissionApiMapper ;

    @Override
    public List<SpPermissionApi> queryList(SpPermissionApi spPermissionApi) {
        return this.list();
    }


    @Override
    public SpPermissionApi getSpPermissionApiById(Long id) {
        return this.getById(id);
    }

    @Override
    public Boolean addSpPermissionApi(SpPermissionApi SpPermissionApi) {
        return this.save(SpPermissionApi);
    }

    @Override
    public Boolean updateSpPermissionApi(SpPermissionApi SpPermissionApi) {
        return this.updateById(SpPermissionApi);
    }

    @Override
    public Boolean deleteSpPermissionApiByIds(Long[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }
}
