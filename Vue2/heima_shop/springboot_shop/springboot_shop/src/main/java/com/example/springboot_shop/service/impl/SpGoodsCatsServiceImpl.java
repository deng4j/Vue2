package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.domain.SpGoodsCats;
import com.example.springboot_shop.mapper.SpGoodsCatsMapper;
import com.example.springboot_shop.service.ISpGoodsCatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpGoodsCatsServiceImpl extends ServiceImpl<SpGoodsCatsMapper, SpGoodsCats> implements ISpGoodsCatsService {

    @Autowired
    private SpGoodsCatsMapper spGoodsCatsMapper ;

    @Override
    public List<SpGoodsCats> queryList(SpGoodsCats spGoodsCats) {
        return this.list();
    }


    @Override
    public SpGoodsCats getSpGoodsCatsById(Long id) {
        return this.getById(id);
    }

    @Override
    public Boolean addSpGoodsCats(SpGoodsCats SpGoodsCats) {
        return this.save(SpGoodsCats);
    }

    @Override
    public Boolean updateSpGoodsCats(SpGoodsCats SpGoodsCats) {
        return this.updateById(SpGoodsCats);
    }

    @Override
    public Boolean deleteSpGoodsCatsByIds(Long[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }
}
