package com.example.springboot_shop.domain;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.*;


@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("sp_user")
public class SpUser implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 自增id
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;


    /**
     * 创建时间
     */
    private Long createTime;


    /**
     * 新用户是否已经通过邮箱激活帐号
     */
    private String isActive;


    /**
     * qq官方唯一编号信息
     */
    private String qqOpenId;


    /**
     * 修改时间
     */
    private Long updateTime;


    /**
     * 邮箱
     */
    private String userEmail;


    /**
     * 新用户注册邮件激活唯一校验码
     */
    private String userEmailCode;


    /**
     * 爱好
     */
    private String userHobby;


    /**
     * 简介
     */
    private String userIntroduce;


    /**
     * qq
     */
    private String userQq;


    /**
     * 性别
     */
    private String userSex;


    /**
     * 手机
     */
    private String userTel;


    /**
     * 学历
     */
    private String userXueli;


    /**
     * 登录名
     */
    private String username;

    private String password;
}
