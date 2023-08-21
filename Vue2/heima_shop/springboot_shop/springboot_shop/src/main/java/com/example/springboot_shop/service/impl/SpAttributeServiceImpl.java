package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.domain.SpAttribute;
import com.example.springboot_shop.mapper.SpAttributeMapper;
import com.example.springboot_shop.service.ISpAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpAttributeServiceImpl extends ServiceImpl<SpAttributeMapper, SpAttribute> implements ISpAttributeService {

    @Autowired
    private SpAttributeMapper spAttributeMapper;

    @Override
    public List<SpAttribute> queryList(SpAttribute spAttribute) {
        return this.list();
    }


    @Override
    public SpAttribute getSpAttributeById(Long id) {
        return this.getById(id);
    }

    @Override
    public Boolean addSpAttribute(SpAttribute SpAttribute) {
        return this.save(SpAttribute);
    }

    @Override
    public Boolean updateSpAttribute(SpAttribute SpAttribute) {
        return this.updateById(SpAttribute);
    }

    @Override
    public Boolean deleteSpAttributeByIds(Long[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }
}
