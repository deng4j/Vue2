package com.example.springboot_shop.controller;

import com.example.springboot_shop.domain.SpGoods;
import com.example.springboot_shop.service.ISpGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spGoods")
public class SpGoodsController {

    @Autowired
    private ISpGoodsService spGoodsService ;

    @GetMapping("/list")
    public List<SpGoods> list(SpGoods spGoods){
        List<SpGoods> spGoodss  = spGoodsService.queryList(spGoods);
        return spGoodss;
    }

    @GetMapping(value = "/{id}")
    public SpGoods getSpGoodsById(@PathVariable("id") Long id){
        SpGoods spGoods  = spGoodsService.getSpGoodsById(id);
        return spGoods;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody SpGoods spGoods){
        return spGoodsService.addSpGoods(spGoods);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody SpGoods spGoods){
        return spGoodsService.updateSpGoods(spGoods);
    }

    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long[] ids){
        return spGoodsService.deleteSpGoodsByIds(ids);
    }
}
