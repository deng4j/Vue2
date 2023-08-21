package com.example.springboot_shop.domain;

import java.util.Date;
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.*;


@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("sp_consignee")
/**
 * 收货人表
 */
public class SpConsignee implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 会员id
     */
    private Long userId;


    /**
     * 主键id
     */
    @TableId(value = "cgn_id", type = IdType.AUTO)
    private Long cgnId;


    /**
     * 收货人地址
     */
    private String cgnAddress;


    /**
     * 邮编
     */
    private String cgnCode;


    /**
     * 收货人名称
     */
    private String cgnName;


    /**
     * 收货人电话
     */
    private String cgnTel;


    /**
     * 删除时间
     */
    private Long deleteTime;


}
