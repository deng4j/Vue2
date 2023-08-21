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
@TableName("sp_express")
/**
 * 快递表
 */
public class SpExpress implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 订单id
     */
    private Long orderId;


    /**
     * 主键id
     */
    @TableId(value = "express_id", type = IdType.AUTO)
    private Long expressId;


    /**
     * 记录生成时间
     */
    private Long createTime;


    /**
     * 订单快递公司名称
     */
    private String expressCom;


    /**
     * 快递单编号
     */
    private String expressNu;


    /**
     * 记录修改时间
     */
    private Long updateTime;


}
