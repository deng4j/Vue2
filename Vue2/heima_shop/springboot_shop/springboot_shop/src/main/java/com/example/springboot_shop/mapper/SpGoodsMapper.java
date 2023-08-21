package com.example.springboot_shop.mapper;

import com.example.springboot_shop.domain.SpGoods;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Mapper
public interface SpGoodsMapper extends BaseMapper<SpGoods> {
}
