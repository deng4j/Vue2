package com.example.springboot_shop.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_shop.domain.SpAttribute;

public interface ISpAttributeService extends IService<SpAttribute> {


    List<SpAttribute> queryList(SpAttribute spAttribute);

    SpAttribute getSpAttributeById(Long id);

    Boolean addSpAttribute(SpAttribute spAttribute);

    Boolean updateSpAttribute(SpAttribute spAttribute);

    Boolean deleteSpAttributeByIds(Long[] ids);
}
