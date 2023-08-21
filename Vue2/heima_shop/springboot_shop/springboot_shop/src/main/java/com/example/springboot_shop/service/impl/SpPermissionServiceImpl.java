package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.domain.SpPermission;
import com.example.springboot_shop.mapper.SpPermissionMapper;
import com.example.springboot_shop.service.ISpPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpPermissionServiceImpl extends ServiceImpl<SpPermissionMapper, SpPermission> implements ISpPermissionService {

    @Autowired
    private SpPermissionMapper spPermissionMapper ;

    @Override
    public List<SpPermission> queryList(SpPermission spPermission) {
        return this.list();
    }


    @Override
    public SpPermission getSpPermissionById(Long id) {
        return this.getById(id);
    }

    @Override
    public Boolean addSpPermission(SpPermission SpPermission) {
        return this.save(SpPermission);
    }

    @Override
    public Boolean updateSpPermission(SpPermission SpPermission) {
        return this.updateById(SpPermission);
    }

    @Override
    public Boolean deleteSpPermissionByIds(Long[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }
}
