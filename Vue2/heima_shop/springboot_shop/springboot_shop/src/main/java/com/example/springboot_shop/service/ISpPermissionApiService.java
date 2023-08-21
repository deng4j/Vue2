package com.example.springboot_shop.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_shop.domain.SpPermissionApi;

public interface ISpPermissionApiService extends IService<SpPermissionApi> {


    List<SpPermissionApi> queryList(SpPermissionApi spPermissionApi);

    SpPermissionApi getSpPermissionApiById(Long id);

    Boolean addSpPermissionApi(SpPermissionApi spPermissionApi);

    Boolean updateSpPermissionApi(SpPermissionApi spPermissionApi);

    Boolean deleteSpPermissionApiByIds(Long[] ids);
}
