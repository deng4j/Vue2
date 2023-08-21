package com.example.springboot_shop.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_shop.domain.SpGoodsCats;

public interface ISpGoodsCatsService extends IService<SpGoodsCats> {


    List<SpGoodsCats> queryList(SpGoodsCats spGoodsCats);

    SpGoodsCats getSpGoodsCatsById(Long id);

    Boolean addSpGoodsCats(SpGoodsCats spGoodsCats);

    Boolean updateSpGoodsCats(SpGoodsCats spGoodsCats);

    Boolean deleteSpGoodsCatsByIds(Long[] ids);
}
