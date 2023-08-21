package com.example.springboot_shop.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;

import com.example.springboot_shop.domain.SpType;

public interface ISpTypeService extends IService<SpType> {


    List<SpType> queryList(SpType spType);

    SpType getSpTypeById(Long id);

    Boolean addSpType(SpType spType);

    Boolean updateSpType(SpType spType);

    Boolean deleteSpTypeByIds(Long[] ids);
}
