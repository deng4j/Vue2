package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.domain.SpConsignee;
import com.example.springboot_shop.mapper.SpConsigneeMapper;
import com.example.springboot_shop.service.ISpConsigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpConsigneeServiceImpl extends ServiceImpl<SpConsigneeMapper,SpConsignee> implements ISpConsigneeService {

    @Autowired
    private SpConsigneeMapper spConsigneeMapper ;

    @Override
    public List<SpConsignee> queryList(SpConsignee spConsignee) {
        return this.list();
    }


    @Override
    public SpConsignee getSpConsigneeById(Long id) {
        return this.getById(id);
    }

    @Override
    public Boolean addSpConsignee(SpConsignee SpConsignee) {
        return this.save(SpConsignee);
    }

    @Override
    public Boolean updateSpConsignee(SpConsignee SpConsignee) {
        return this.updateById(SpConsignee);
    }

    @Override
    public Boolean deleteSpConsigneeByIds(Long[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }
}
