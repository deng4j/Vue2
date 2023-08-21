package com.example.springboot_shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Arrays;
import java.util.List;

import com.example.springboot_shop.domain.SpType;
import com.example.springboot_shop.mapper.SpTypeMapper;
import com.example.springboot_shop.service.ISpTypeService;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpTypeServiceImpl extends ServiceImpl<SpTypeMapper,SpType> implements ISpTypeService {

    @Autowired
    private SpTypeMapper spTypeMapper ;

    @Override
    public List<SpType> queryList(SpType spType) {
        return this.list();
    }


    @Override
    public SpType getSpTypeById(Long id) {
        return this.getById(id);
    }

    @Override
    public Boolean addSpType(SpType SpType) {
        return this.save(SpType);
    }

    @Override
    public Boolean updateSpType(SpType SpType) {
        return this.updateById(SpType);
    }

    @Override
    public Boolean deleteSpTypeByIds(Long[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }
}
