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
@TableName("sp_permission")
//权限表
public class SpPermission implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     *
     */
    @TableId(value = "ps_id", type = IdType.AUTO)
    private String psId;


    /**
     * 操作方法
     */
    private String psA;


    /**
     * 控制器
     */
    private String psC;


    /**
     * 权限等级
     */
    private String psLevel;


    /**
     * 权限名称
     */
    private String psName;


    /**
     * 父id
     */
    private String psPid;


}
