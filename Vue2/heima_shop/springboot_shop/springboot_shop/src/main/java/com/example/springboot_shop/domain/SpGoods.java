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
@TableName("sp_goods")
//商品表
public class SpGoods implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 添加商品时间
     */
    private Long addTime;


    /**
     * 商品价格
     */
    private BigDecimal goodsPrice;


    /**
     * 商品名称
     */
    private String goodsName;


    /**
     * 主键id
     */
    @TableId(value = "goods_id", type = IdType.AUTO)
    private String goodsId;


    /**
     * 修改商品时间
     */
    private Long updTime;


    /**
     * 是否促销
     */
    private String isPromote;


    /**
     * 0:正常  1:删除
     */
    private String isDel;


    /**
     * 热卖数量
     */
    private Long hotMumber;


    /**
     * 商品重量
     */
    private String goodsWeight;


    /**
     * 商品状态 0: 未通过 1: 审核中 2: 已审核
     */
    private Long goodsState;


    /**
     * 图片logo小图
     */
    private String goodsSmallLogo;


    /**
     * 商品数量
     */
    private Long goodsNumber;


    /**
     * 商品详情介绍
     */
    private String goodsIntroduce;


    /**
     * 图片logo大图
     */
    private String goodsBigLogo;


    /**
     * 软删除标志字段
     */
    private Long deleteTime;


    /**
     * 二级分类id
     */
    private String catTwoId;


    /**
     * 三级分类id
     */
    private String catThreeId;


    /**
     * 一级分类id
     */
    private String catOneId;


    /**
     * 类型id
     */
    private String catId;


}
