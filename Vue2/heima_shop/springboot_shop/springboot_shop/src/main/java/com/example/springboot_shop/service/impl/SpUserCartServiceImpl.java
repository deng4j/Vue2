package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.domain.SpUserCart;
import com.example.springboot_shop.mapper.SpUserCartMapper;
import com.example.springboot_shop.service.ISpUserCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpUserCartServiceImpl extends ServiceImpl<SpUserCartMapper, SpUserCart> implements ISpUserCartService {

    @Autowired
    private SpUserCartMapper spUserCartMapper ;

    @Override
    public List<SpUserCart> queryList(SpUserCart spUserCart) {
        return this.list();
    }


    @Override
    public SpUserCart getSpUserCartById(Long id) {
        return this.getById(id);
    }

    @Override
    public Boolean addSpUserCart(SpUserCart SpUserCart) {
        return this.save(SpUserCart);
    }

    @Override
    public Boolean updateSpUserCart(SpUserCart SpUserCart) {
        return this.updateById(SpUserCart);
    }

    @Override
    public Boolean deleteSpUserCartByIds(Long[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }
}
