package com.example.springboot_shop.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_shop.domain.SpUserCart;

public interface ISpUserCartService extends IService<SpUserCart> {


    List<SpUserCart> queryList(SpUserCart spUserCart);

    SpUserCart getSpUserCartById(Long id);

    Boolean addSpUserCart(SpUserCart spUserCart);

    Boolean updateSpUserCart(SpUserCart spUserCart);

    Boolean deleteSpUserCartByIds(Long[] ids);
}
