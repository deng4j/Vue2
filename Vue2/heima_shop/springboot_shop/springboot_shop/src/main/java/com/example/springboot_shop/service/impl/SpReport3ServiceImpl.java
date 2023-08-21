package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.domain.SpReport3;
import com.example.springboot_shop.mapper.SpReport3Mapper;
import com.example.springboot_shop.service.ISpReport3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpReport3ServiceImpl extends ServiceImpl<SpReport3Mapper, SpReport3> implements ISpReport3Service {

    @Autowired
    private SpReport3Mapper spReport3Mapper ;

    @Override
    public List<SpReport3> queryList(SpReport3 spReport3) {
        return this.list();
    }


    @Override
    public SpReport3 getSpReport3ById(Long id) {
        return this.getById(id);
    }

    @Override
    public Boolean addSpReport3(SpReport3 SpReport3) {
        return this.save(SpReport3);
    }

    @Override
    public Boolean updateSpReport3(SpReport3 SpReport3) {
        return this.updateById(SpReport3);
    }

    @Override
    public Boolean deleteSpReport3ByIds(Long[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }
}
