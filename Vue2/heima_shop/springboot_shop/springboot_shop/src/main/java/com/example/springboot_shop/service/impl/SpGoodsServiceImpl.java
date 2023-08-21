package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.domain.SpGoods;
import com.example.springboot_shop.mapper.SpGoodsMapper;
import com.example.springboot_shop.service.ISpGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpGoodsServiceImpl extends ServiceImpl<SpGoodsMapper, SpGoods> implements ISpGoodsService {

    @Autowired
    private SpGoodsMapper spGoodsMapper ;

    @Override
    public List<SpGoods> queryList(SpGoods spGoods) {
        return this.list();
    }


    @Override
    public SpGoods getSpGoodsById(Long id) {
        return this.getById(id);
    }

    @Override
    public Boolean addSpGoods(SpGoods SpGoods) {
        return this.save(SpGoods);
    }

    @Override
    public Boolean updateSpGoods(SpGoods SpGoods) {
        return this.updateById(SpGoods);
    }

    @Override
    public Boolean deleteSpGoodsByIds(Long[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }
}
