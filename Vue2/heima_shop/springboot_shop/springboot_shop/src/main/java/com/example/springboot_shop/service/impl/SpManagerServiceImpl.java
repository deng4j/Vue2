package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.domain.SpManager;
import com.example.springboot_shop.mapper.SpManagerMapper;
import com.example.springboot_shop.service.ISpManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpManagerServiceImpl extends ServiceImpl<SpManagerMapper, SpManager> implements ISpManagerService {

    @Autowired
    private SpManagerMapper spManagerMapper ;

    @Override
    public List<SpManager> queryList(SpManager spManager) {
        return this.list();
    }


    @Override
    public SpManager getSpManagerById(Long id) {
        return this.getById(id);
    }

    @Override
    public Boolean addSpManager(SpManager SpManager) {
        return this.save(SpManager);
    }

    @Override
    public Boolean updateSpManager(SpManager SpManager) {
        return this.updateById(SpManager);
    }

    @Override
    public Boolean deleteSpManagerByIds(Long[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }
}
