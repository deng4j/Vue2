package com.example.springboot_shop.controller;

import com.alibaba.fastjson.JSON;
import com.example.springboot_shop.common.AjaxResult;
import com.example.springboot_shop.domain.SpUser;
import com.example.springboot_shop.domain.VO.SpUserVO;
import com.example.springboot_shop.service.ISpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/private/v1")
public class ShopApiController {

    @Autowired
    private ISpUserService spUserService;

    @PostMapping("/login")
    public AjaxResult login(@RequestBody SpUser spUser) throws Exception {
        SpUserVO userVO = spUserService.login(spUser);
        return AjaxResult.ok(userVO,"获取成功",200);
    }

    @GetMapping("/menus")
    public ResponseEntity<Object> menus(){
        Object jsonObj = JSON.parse("{\n" +
                "\t\"data\": {\n" +
                "\t\t\"id\": 101,\n" +
                "\t\t\"authName\": \"商品管理\",\n" +
                "\t\t\"path\": null,\n" +
                "\t\t\"children\": [{\n" +
                "\t\t\t\"id\": 104,\n" +
                "\t\t\t\"authName\": \"商品列表\",\n" +
                "\t\t\t\"path\": null,\n" +
                "\t\t\t\"children\": []\n" +
                "\t\t}]\n" +
                "\t},\n" +
                "\t\"meta\": {\n" +
                "\t\t\"msg\": \"获取菜单列表成功\",\n" +
                "\t\t\"status\": 200\n" +
                "\t}\n" +
                "}");
        return ResponseEntity.ok(jsonObj);
    }
}
