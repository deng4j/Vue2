package com.example.springboot_shop.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_shop.domain.SpPermission;

public interface ISpPermissionService extends IService<SpPermission> {


    List<SpPermission> queryList(SpPermission spPermission);

    SpPermission getSpPermissionById(Long id);

    Boolean addSpPermission(SpPermission spPermission);

    Boolean updateSpPermission(SpPermission spPermission);

    Boolean deleteSpPermissionByIds(Long[] ids);
}
