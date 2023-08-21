package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.domain.SpExpress;
import com.example.springboot_shop.mapper.SpExpressMapper;
import com.example.springboot_shop.service.ISpExpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpExpressServiceImpl extends ServiceImpl<SpExpressMapper,SpExpress> implements ISpExpressService {

    @Autowired
    private SpExpressMapper spExpressMapper ;

    @Override
    public List<SpExpress> queryList(SpExpress spExpress) {
        return this.list();
    }


    @Override
    public SpExpress getSpExpressById(Long id) {
        return this.getById(id);
    }

    @Override
    public Boolean addSpExpress(SpExpress SpExpress) {
        return this.save(SpExpress);
    }

    @Override
    public Boolean updateSpExpress(SpExpress SpExpress) {
        return this.updateById(SpExpress);
    }

    @Override
    public Boolean deleteSpExpressByIds(Long[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }
}
