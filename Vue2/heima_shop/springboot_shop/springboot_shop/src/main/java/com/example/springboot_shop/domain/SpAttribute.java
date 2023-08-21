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
@TableName("sp_attribute")
public class SpAttribute implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 外键，类型id
     */
    private String catId;


    /**
     * 主键id
     */
    @TableId(value = "attr_id", type = IdType.AUTO)
    private String attrId;


    /**
     * 属性名称
     */
    private String attrName;


    /**
     * only:输入框(唯一)  many:后台下拉列表/前台单选框
     */
    private String attrSel;


    /**
     * 可选值列表信息,例如颜色：白色,红色,绿色,多个可选值通过逗号分隔
     */
    private String attrVals;


    /**
     * manual:手工录入  list:从列表选择
     */
    private String attrWrite;


    /**
     * 删除时间标志
     */
    private Long deleteTime;


}
