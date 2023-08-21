package com.example.springboot_shop.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_shop.domain.SpCategory;

public interface ISpCategoryService extends IService<SpCategory> {


    List<SpCategory> queryList(SpCategory spCategory);

    SpCategory getSpCategoryById(Long id);

    Boolean addSpCategory(SpCategory spCategory);

    Boolean updateSpCategory(SpCategory spCategory);

    Boolean deleteSpCategoryByIds(Long[] ids);
}
