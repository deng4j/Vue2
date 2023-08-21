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
@TableName("sp_permission_api")
public class SpPermissionApi implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     *
     */
    private Long psId;


    /**
     *
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    /**
     *
     */
    private String psApiAction;


    /**
     *
     */
    private Long psApiOrder;


    /**
     *
     */
    private String psApiPath;


    /**
     *
     */
    private String psApiService;
}
