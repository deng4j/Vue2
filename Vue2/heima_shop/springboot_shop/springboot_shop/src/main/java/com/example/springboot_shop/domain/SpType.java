package com.example.springboot_shop.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.*;


@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("sp_type")
//类型表
public class SpType implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键id
     */
    @TableId(value = "type_id", type = IdType.AUTO)
    private String typeId;


    /**
     * 删除时间标志
     */
    private Long deleteTime;


    /**
     * 类型名称
     */
    private String typeName;


}
