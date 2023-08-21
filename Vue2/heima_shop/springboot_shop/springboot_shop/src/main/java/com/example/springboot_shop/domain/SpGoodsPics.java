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
@TableName("sp_goods_pics")
/**
 * 商品-相册关联表
 */
public class SpGoodsPics implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 商品id
     */
    private String goodsId;


    /**
     * 主键id
     */
    @TableId(value = "pics_id", type = IdType.AUTO)
    private Long picsId;


    /**
     * 相册大图800*800
     */
    private String picsBig;


    /**
     * 相册中图350*350
     */
    private String picsMid;


    /**
     * 相册小图50*50
     */
    private String picsSma;


}
