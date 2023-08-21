package com.example.springboot_shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_shop.domain.SpUser;
import com.example.springboot_shop.domain.VO.SpUserVO;

import java.util.List;

public interface ISpUserService extends IService<SpUser> {


    List<SpUser> queryList(SpUser spUser);

    SpUser getSpUserById(Long id);

    Boolean addSpUser(SpUser spUser);

    Boolean updateSpUser(SpUser spUser);

    Boolean deleteSpUserByIds(Long[] ids);

    SpUserVO login(SpUser spUser);
}
