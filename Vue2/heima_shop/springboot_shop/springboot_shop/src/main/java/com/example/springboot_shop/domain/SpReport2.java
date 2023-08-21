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
@TableName("sp_report_2")
public class SpReport2 implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     *
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    /**
     *
     */
    private Long rp2Count;


    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date rp2Date;


    /**
     *
     */
    private String rp2Page;


}
