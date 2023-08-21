package com.example.springboot_shop.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot_shop.domain.SpUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SpUserMapper extends BaseMapper<SpUser> {
}
