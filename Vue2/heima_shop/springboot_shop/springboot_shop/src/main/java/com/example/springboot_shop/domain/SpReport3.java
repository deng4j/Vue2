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
@TableName("sp_report_3")
public class SpReport3  implements Serializable{
private static final long serialVersionUID=1L;


        /**
        * 
        */
        @TableId(value = "id" , type = IdType.AUTO)
        private Long id;


        /**
        * 数量
        */
        private Long rp3Count;


        /**
        * 
        */
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private Date rp3Date;


        /**
        * 用户来源
        */
        private String rp3Src;


}
