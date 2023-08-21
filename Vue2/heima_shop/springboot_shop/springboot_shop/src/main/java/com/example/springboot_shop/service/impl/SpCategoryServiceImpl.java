package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.domain.SpCategory;
import com.example.springboot_shop.mapper.SpCategoryMapper;
import com.example.springboot_shop.service.ISpCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpCategoryServiceImpl extends ServiceImpl<SpCategoryMapper, SpCategory> implements ISpCategoryService {

    @Autowired
    private SpCategoryMapper spCategoryMapper ;

    @Override
    public List<SpCategory> queryList(SpCategory spCategory) {
        return this.list();
    }


    @Override
    public SpCategory getSpCategoryById(Long id) {
        return this.getById(id);
    }

    @Override
    public Boolean addSpCategory(SpCategory SpCategory) {
        return this.save(SpCategory);
    }

    @Override
    public Boolean updateSpCategory(SpCategory SpCategory) {
        return this.updateById(SpCategory);
    }

    @Override
    public Boolean deleteSpCategoryByIds(Long[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }
}
