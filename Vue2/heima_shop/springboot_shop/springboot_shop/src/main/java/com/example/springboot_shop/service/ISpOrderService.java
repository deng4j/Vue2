package com.example.springboot_shop.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_shop.domain.SpOrder;

public interface ISpOrderService extends IService<SpOrder> {


    List<SpOrder> queryList(SpOrder spOrder);

    SpOrder getSpOrderById(Long id);

    Boolean addSpOrder(SpOrder spOrder);

    Boolean updateSpOrder(SpOrder spOrder);

    Boolean deleteSpOrderByIds(Long[] ids);
}
