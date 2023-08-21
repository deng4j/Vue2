package com.example.springboot_shop.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_shop.domain.SpGoods;

public interface ISpGoodsService extends IService<SpGoods> {


    List<SpGoods> queryList(SpGoods spGoods);

    SpGoods getSpGoodsById(Long id);

    Boolean addSpGoods(SpGoods spGoods);

    Boolean updateSpGoods(SpGoods spGoods);

    Boolean deleteSpGoodsByIds(Long[] ids);
}
