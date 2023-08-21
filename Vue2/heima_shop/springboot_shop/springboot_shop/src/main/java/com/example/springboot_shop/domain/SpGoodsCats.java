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
@TableName("sp_goods_cats")
public class SpGoodsCats implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 分类id
     */
    @TableId(value = "cat_id", type = IdType.AUTO)
    private Long catId;


    /**
     * 分类名称
     */
    private String catName;


    /**
     * 分类排序
     */
    private Long catSort;


    /**
     * 创建时间
     */
    private Long createTime;


    /**
     * 数据标记
     */
    private Integer dataFlag;


    /**
     * 是否显示
     */
    private Integer isShow;


    /**
     * 父级id
     */
    private Long parentId;


}
