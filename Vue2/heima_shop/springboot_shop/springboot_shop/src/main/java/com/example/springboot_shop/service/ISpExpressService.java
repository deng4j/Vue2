package com.example.springboot_shop.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_shop.domain.SpExpress;

public interface ISpExpressService extends IService<SpExpress> {


    List<SpExpress> queryList(SpExpress spExpress);

    SpExpress getSpExpressById(Long id);

    Boolean addSpExpress(SpExpress spExpress);

    Boolean updateSpExpress(SpExpress spExpress);

    Boolean deleteSpExpressByIds(Long[] ids);
}
