package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.domain.SpOrder;
import com.example.springboot_shop.mapper.SpOrderMapper;
import com.example.springboot_shop.service.ISpOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpOrderServiceImpl extends ServiceImpl<SpOrderMapper, SpOrder> implements ISpOrderService {

    @Autowired
    private SpOrderMapper spOrderMapper ;

    @Override
    public List<SpOrder> queryList(SpOrder spOrder) {
        return this.list();
    }


    @Override
    public SpOrder getSpOrderById(Long id) {
        return this.getById(id);
    }

    @Override
    public Boolean addSpOrder(SpOrder SpOrder) {
        return this.save(SpOrder);
    }

    @Override
    public Boolean updateSpOrder(SpOrder SpOrder) {
        return this.updateById(SpOrder);
    }

    @Override
    public Boolean deleteSpOrderByIds(Long[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }
}
