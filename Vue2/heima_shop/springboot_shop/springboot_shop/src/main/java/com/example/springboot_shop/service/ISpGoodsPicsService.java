package com.example.springboot_shop.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_shop.domain.SpGoodsPics;

public interface ISpGoodsPicsService extends IService<SpGoodsPics> {


    List<SpGoodsPics> queryList(SpGoodsPics spGoodsPics);

    SpGoodsPics getSpGoodsPicsById(Long id);

    Boolean addSpGoodsPics(SpGoodsPics spGoodsPics);

    Boolean updateSpGoodsPics(SpGoodsPics spGoodsPics);

    Boolean deleteSpGoodsPicsByIds(Long[] ids);
}
