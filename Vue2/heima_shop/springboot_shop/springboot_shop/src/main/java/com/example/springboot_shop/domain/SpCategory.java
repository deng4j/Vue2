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
@TableName("sp_category")
public class SpCategory implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 分类唯一ID
     */
    @TableId(value = "cat_id", type = IdType.AUTO)
    private Long catId;


    /**
     * 是否删除 1为删除
     */
    private Long catDeleted;


    /**
     *
     */
    private String catIcon;


    /**
     * 分类层级 0: 顶级 1:二级 2:三级
     */
    private Long catLevel;


    /**
     * 分类名称
     */
    private String catName;


    /**
     * 分类父ID
     */
    private Long catPid;


    /**
     *
     */
    private String catSrc;
}
