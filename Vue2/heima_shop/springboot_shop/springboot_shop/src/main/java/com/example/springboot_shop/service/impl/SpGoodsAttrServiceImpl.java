package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.domain.SpGoodsAttr;
import com.example.springboot_shop.mapper.SpGoodsAttrMapper;
import com.example.springboot_shop.service.ISpGoodsAttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpGoodsAttrServiceImpl extends ServiceImpl<SpGoodsAttrMapper, SpGoodsAttr> implements ISpGoodsAttrService {

    @Autowired
    private SpGoodsAttrMapper spGoodsAttrMapper ;

    @Override
    public List<SpGoodsAttr> queryList(SpGoodsAttr spGoodsAttr) {
        return this.list();
    }


    @Override
    public SpGoodsAttr getSpGoodsAttrById(Long id) {
        return this.getById(id);
    }

    @Override
    public Boolean addSpGoodsAttr(SpGoodsAttr SpGoodsAttr) {
        return this.save(SpGoodsAttr);
    }

    @Override
    public Boolean updateSpGoodsAttr(SpGoodsAttr SpGoodsAttr) {
        return this.updateById(SpGoodsAttr);
    }

    @Override
    public Boolean deleteSpGoodsAttrByIds(Long[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }
}
