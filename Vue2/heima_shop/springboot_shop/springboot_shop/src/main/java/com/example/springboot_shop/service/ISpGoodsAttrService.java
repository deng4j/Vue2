package com.example.springboot_shop.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_shop.domain.SpGoodsAttr;

public interface ISpGoodsAttrService extends IService<SpGoodsAttr> {


    List<SpGoodsAttr> queryList(SpGoodsAttr spGoodsAttr);

    SpGoodsAttr getSpGoodsAttrById(Long id);

    Boolean addSpGoodsAttr(SpGoodsAttr spGoodsAttr);

    Boolean updateSpGoodsAttr(SpGoodsAttr spGoodsAttr);

    Boolean deleteSpGoodsAttrByIds(Long[] ids);
}
