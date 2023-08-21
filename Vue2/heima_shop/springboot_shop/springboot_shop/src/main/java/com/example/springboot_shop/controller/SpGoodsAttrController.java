package com.example.springboot_shop.controller;

import com.example.springboot_shop.domain.SpGoodsAttr;
import com.example.springboot_shop.service.ISpGoodsAttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spGoodsAttr")
public class SpGoodsAttrController {

    @Autowired
    private ISpGoodsAttrService spGoodsAttrService ;

    @GetMapping("/list")
    public List<SpGoodsAttr> list(SpGoodsAttr spGoodsAttr){
        List<SpGoodsAttr> spGoodsAttrs  = spGoodsAttrService.queryList(spGoodsAttr);
        return spGoodsAttrs;
    }

    @GetMapping(value = "/{id}")
    public SpGoodsAttr getSpGoodsAttrById(@PathVariable("id") Long id){
        SpGoodsAttr spGoodsAttr  = spGoodsAttrService.getSpGoodsAttrById(id);
        return spGoodsAttr;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody SpGoodsAttr spGoodsAttr){
        return spGoodsAttrService.addSpGoodsAttr(spGoodsAttr);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody SpGoodsAttr spGoodsAttr){
        return spGoodsAttrService.updateSpGoodsAttr(spGoodsAttr);
    }

    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long[] ids){
        return spGoodsAttrService.deleteSpGoodsAttrByIds(ids);
    }
}
