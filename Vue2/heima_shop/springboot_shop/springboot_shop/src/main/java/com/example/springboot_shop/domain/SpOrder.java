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
@TableName("sp_order")
/**
 * 订单表
 */
public class SpOrder implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 记录生成时间
     */
    private Long createTime;


    /**
     * 订单编号
     */
    private String orderNumber;


    /**
     * 主键id
     */
    @TableId(value = "order_id", type = IdType.AUTO)
    private Long orderId;


    /**
     * consignee收货人地址
     */
    private String consigneeAddr;


    /**
     * 订单是否已经发货
     */
    private String isSend;


    /**
     * 公司名称
     */
    private String orderFapiaoCompany;


    /**
     * 发票内容
     */
    private String orderFapiaoContent;


    /**
     * 发票抬头 个人 公司
     */
    private String orderFapiaoTitle;


    /**
     * 支付方式  0未支付 1支付宝  2微信  3银行卡
     */
    private String orderPay;


    /**
     * 订单总金额
     */
    private BigDecimal orderPrice;


    /**
     * 订单状态： 0未付款、1已付款
     */
    private String payStatus;


    /**
     * 支付宝交易流水号码
     */
    private String tradeNo;


    /**
     * 记录修改时间
     */
    private Long updateTime;


    /**
     * 下订单会员id
     */
    private String userId;


}
