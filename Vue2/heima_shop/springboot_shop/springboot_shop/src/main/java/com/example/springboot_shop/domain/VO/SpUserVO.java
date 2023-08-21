package com.example.springboot_shop.domain.VO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@Data
@NoArgsConstructor
@Accessors(chain = true)
public class SpUserVO implements Serializable {
    private static final long serialVersionUID = 1L;


    private Long id;

    private Long rid;

    /**
     * 邮箱
     */
    private String email;



    /**
     * 手机
     */
    private String mobile;



    /**
     * 登录名
     */
    private String username;

    private String token;
}
