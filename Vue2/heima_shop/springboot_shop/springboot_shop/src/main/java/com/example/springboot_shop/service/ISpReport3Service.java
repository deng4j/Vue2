package com.example.springboot_shop.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_shop.domain.SpReport3;

public interface ISpReport3Service extends IService<SpReport3> {


    List<SpReport3> queryList(SpReport3 spReport3);

    SpReport3 getSpReport3ById(Long id);

    Boolean addSpReport3(SpReport3 spReport3);

    Boolean updateSpReport3(SpReport3 spReport3);

    Boolean deleteSpReport3ByIds(Long[] ids);
}
