package com.example.springboot_shop.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_shop.domain.SpReport1;

public interface ISpReport1Service extends IService<SpReport1> {


    List<SpReport1> queryList(SpReport1 spReport1);

    SpReport1 getSpReport1ById(Long id);

    Boolean addSpReport1(SpReport1 spReport1);

    Boolean updateSpReport1(SpReport1 spReport1);

    Boolean deleteSpReport1ByIds(Long[] ids);
}
