package com.example.springboot_shop.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_shop.domain.SpConsignee;

public interface ISpConsigneeService extends IService<SpConsignee> {


    List<SpConsignee> queryList(SpConsignee spConsignee);

    SpConsignee getSpConsigneeById(Long id);

    Boolean addSpConsignee(SpConsignee spConsignee);

    Boolean updateSpConsignee(SpConsignee spConsignee);

    Boolean deleteSpConsigneeByIds(Long[] ids);
}
