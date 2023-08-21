package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.domain.SpOrderGoods;
import com.example.springboot_shop.mapper.SpOrderGoodsMapper;
import com.example.springboot_shop.service.ISpOrderGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpOrderGoodsServiceImpl extends ServiceImpl<SpOrderGoodsMapper, SpOrderGoods> implements ISpOrderGoodsService {

    @Autowired
    private SpOrderGoodsMapper spOrderGoodsMapper ;

    @Override
    public List<SpOrderGoods> queryList(SpOrderGoods spOrderGoods) {
        return this.list();
    }


    @Override
    public SpOrderGoods getSpOrderGoodsById(Long id) {
        return this.getById(id);
    }

    @Override
    public Boolean addSpOrderGoods(SpOrderGoods SpOrderGoods) {
        return this.save(SpOrderGoods);
    }

    @Override
    public Boolean updateSpOrderGoods(SpOrderGoods SpOrderGoods) {
        return this.updateById(SpOrderGoods);
    }

    @Override
    public Boolean deleteSpOrderGoodsByIds(Long[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }
}
