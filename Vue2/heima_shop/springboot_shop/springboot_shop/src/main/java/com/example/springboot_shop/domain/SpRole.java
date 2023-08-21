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
@TableName("sp_role")
public class SpRole implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     *
     */
    @TableId(value = "role_id", type = IdType.AUTO)
    private String roleId;


    /**
     * 控制器-操作,控制器-操作,控制器-操作
     */
    private String psCa;


    /**
     * 权限ids,1,2,5
     */
    private String psIds;


    /**
     *
     */
    private String roleDesc;


    /**
     * 角色名称
     */
    private String roleName;


}
