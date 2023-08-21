package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.domain.SpReport2;
import com.example.springboot_shop.mapper.SpReport2Mapper;
import com.example.springboot_shop.service.ISpReport2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpReport2ServiceImpl extends ServiceImpl<SpReport2Mapper, SpReport2> implements ISpReport2Service {

    @Autowired
    private SpReport2Mapper spReport2Mapper ;

    @Override
    public List<SpReport2> queryList(SpReport2 spReport2) {
        return this.list();
    }


    @Override
    public SpReport2 getSpReport2ById(Long id) {
        return this.getById(id);
    }

    @Override
    public Boolean addSpReport2(SpReport2 SpReport2) {
        return this.save(SpReport2);
    }

    @Override
    public Boolean updateSpReport2(SpReport2 SpReport2) {
        return this.updateById(SpReport2);
    }

    @Override
    public Boolean deleteSpReport2ByIds(Long[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }
}
