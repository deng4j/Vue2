package com.example.springboot_shop.mapper;

import com.example.springboot_shop.domain.SpCategory;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Mapper
public interface SpCategoryMapper extends BaseMapper<SpCategory> {
}
