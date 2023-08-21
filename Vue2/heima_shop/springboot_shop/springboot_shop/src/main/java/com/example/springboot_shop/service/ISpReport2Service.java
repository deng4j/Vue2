package com.example.springboot_shop.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_shop.domain.SpReport2;

public interface ISpReport2Service extends IService<SpReport2> {


    List<SpReport2> queryList(SpReport2 spReport2);

    SpReport2 getSpReport2ById(Long id);

    Boolean addSpReport2(SpReport2 spReport2);

    Boolean updateSpReport2(SpReport2 spReport2);

    Boolean deleteSpReport2ByIds(Long[] ids);
}
