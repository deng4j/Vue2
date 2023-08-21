package com.example.springboot_shop.interceptor;

import com.example.springboot_shop.common.AdminHolder;
import com.example.springboot_shop.common.User;
import com.example.springboot_shop.utils.JwtUtils;
import io.jsonwebtoken.Claims;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 */
@Component
public class TokenInterceptor implements HandlerInterceptor {
    private static final Logger log = LoggerFactory.getLogger(TokenInterceptor.class);

    /**
     * 前置处理
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //1、获取头信息
        String token = request.getHeader("Authorization");
        if (StringUtils.isEmpty(token)&&!JwtUtils.verifyToken(token)){
            log.info("请求：{} 被拦截",request.getRequestURI());
            return false;
        }
        token = token.replace("Bearer ", "");

        //2、调用service根据token查询用户
        Claims claims = JwtUtils.getClaims(token);
        User admin = new User();
        admin.setId(claims.get("id",Long.class));
        admin.setUsername(claims.get("username",String.class));
        //4、将对象存入Threadlocal
        AdminHolder.set(admin);
        return true;
    }
}