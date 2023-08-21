package com.example.springboot_shop.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_shop.domain.SpOrderGoods;

public interface ISpOrderGoodsService extends IService<SpOrderGoods> {


    List<SpOrderGoods> queryList(SpOrderGoods spOrderGoods);

    SpOrderGoods getSpOrderGoodsById(Long id);

    Boolean addSpOrderGoods(SpOrderGoods spOrderGoods);

    Boolean updateSpOrderGoods(SpOrderGoods spOrderGoods);

    Boolean deleteSpOrderGoodsByIds(Long[] ids);
}
