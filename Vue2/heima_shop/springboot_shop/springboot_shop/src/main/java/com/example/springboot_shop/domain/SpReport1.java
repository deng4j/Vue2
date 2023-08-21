package com.example.springboot_shop.domain;

import java.util.Date;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.*;


@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("sp_report_1")
public class SpReport1 implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     *
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    /**
     * 地区
     */
    private String rp1Area;


    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date rp1Date;


    /**
     * 用户数
     */
    private Long rp1UserCount;


}
