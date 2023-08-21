package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.domain.SpGoodsPics;
import com.example.springboot_shop.mapper.SpGoodsPicsMapper;
import com.example.springboot_shop.service.ISpGoodsPicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpGoodsPicsServiceImpl extends ServiceImpl<SpGoodsPicsMapper, SpGoodsPics> implements ISpGoodsPicsService {

    @Autowired
    private SpGoodsPicsMapper spGoodsPicsMapper ;

    @Override
    public List<SpGoodsPics> queryList(SpGoodsPics spGoodsPics) {
        return this.list();
    }


    @Override
    public SpGoodsPics getSpGoodsPicsById(Long id) {
        return this.getById(id);
    }

    @Override
    public Boolean addSpGoodsPics(SpGoodsPics SpGoodsPics) {
        return this.save(SpGoodsPics);
    }

    @Override
    public Boolean updateSpGoodsPics(SpGoodsPics SpGoodsPics) {
        return this.updateById(SpGoodsPics);
    }

    @Override
    public Boolean deleteSpGoodsPicsByIds(Long[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }
}
