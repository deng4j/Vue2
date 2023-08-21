package com.example.springboot_shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_shop.domain.SpRole;

import java.util.List;

public interface ISpRoleService extends IService<SpRole> {


    List<SpRole> queryList(SpRole spRole);

    SpRole getSpRoleById(Long id);

    Boolean addSpRole(SpRole spRole);

    Boolean updateSpRole(SpRole spRole);

    Boolean deleteSpRoleByIds(Long[] ids);
}
