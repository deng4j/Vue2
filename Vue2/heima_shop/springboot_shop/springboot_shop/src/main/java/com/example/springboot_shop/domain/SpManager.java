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
@TableName("sp_manager")
//管理员表
public class SpManager implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键id
     */
    @TableId(value = "mg_id", type = IdType.AUTO)
    private Long mgId;


    /**
     *
     */
    private String mgEmail;


    /**
     *
     */
    private String mgMobile;


    /**
     * 名称
     */
    private String mgName;


    /**
     * 密码
     */
    private String mgPwd;


    /**
     * 1：表示启用 0:表示禁用
     */
    private Integer mgState;


    /**
     * 注册时间
     */
    private Long mgTime;


    /**
     * 角色id
     */
    private Integer roleId;

}
