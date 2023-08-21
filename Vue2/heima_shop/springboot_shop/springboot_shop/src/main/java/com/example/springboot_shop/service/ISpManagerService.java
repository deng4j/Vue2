package com.example.springboot_shop.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_shop.domain.SpManager;

public interface ISpManagerService extends IService<SpManager> {


    List<SpManager> queryList(SpManager spManager);

    SpManager getSpManagerById(Long id);

    Boolean addSpManager(SpManager spManager);

    Boolean updateSpManager(SpManager spManager);

    Boolean deleteSpManagerByIds(Long[] ids);
}
