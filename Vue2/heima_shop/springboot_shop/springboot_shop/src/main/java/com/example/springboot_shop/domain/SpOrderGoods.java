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
@TableName("sp_order_goods")
//商品订单关联表
public class SpOrderGoods implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 商品id
     */
    private String goodsId;


    /**
     * 订单id
     */
    private Long orderId;


    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    /**
     * 购买单个商品数量
     */
    private Integer goodsNumber;


    /**
     * 商品单价
     */
    private BigDecimal goodsPrice;


    /**
     * 商品小计价格
     */
    private BigDecimal goodsTotalPrice;


}
