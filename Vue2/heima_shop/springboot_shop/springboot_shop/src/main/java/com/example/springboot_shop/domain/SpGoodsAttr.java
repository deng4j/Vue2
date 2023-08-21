package com.example.springboot_shop.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.*;


@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("sp_goods_attr")
/**
 * 商品-属性关联表
 */
public class SpGoodsAttr implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 属性id
     */
    private String attrId;


    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    /**
     * 该属性需要额外增加的价钱
     */
    private BigDecimal addPrice;


    /**
     * 商品对应属性的值
     */
    private String attrValue;


    /**
     * 商品id
     */
    private String goodsId;


}
