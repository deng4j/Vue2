package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.domain.SpReport1;
import com.example.springboot_shop.mapper.SpReport1Mapper;
import com.example.springboot_shop.service.ISpReport1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpReport1ServiceImpl extends ServiceImpl<SpReport1Mapper, SpReport1> implements ISpReport1Service {

    @Autowired
    private SpReport1Mapper spReport1Mapper ;

    @Override
    public List<SpReport1> queryList(SpReport1 spReport1) {
        return this.list();
    }


    @Override
    public SpReport1 getSpReport1ById(Long id) {
        return this.getById(id);
    }

    @Override
    public Boolean addSpReport1(SpReport1 SpReport1) {
        return this.save(SpReport1);
    }

    @Override
    public Boolean updateSpReport1(SpReport1 SpReport1) {
        return this.updateById(SpReport1);
    }

    @Override
    public Boolean deleteSpReport1ByIds(Long[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }
}
