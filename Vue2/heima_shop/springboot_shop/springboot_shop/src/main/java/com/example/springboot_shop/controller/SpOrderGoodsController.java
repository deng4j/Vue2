package com.example.springboot_shop.controller;

import com.example.springboot_shop.domain.SpOrderGoods;
import com.example.springboot_shop.service.ISpOrderGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spOrderGoods")
public class SpOrderGoodsController {

    @Autowired
    private ISpOrderGoodsService spOrderGoodsService;

    @GetMapping("/list")
    public List<SpOrderGoods> list(SpOrderGoods spOrderGoods) {
        List<SpOrderGoods> spOrderGoodss = spOrderGoodsService.queryList(spOrderGoods);
        return spOrderGoodss;
    }

    @GetMapping(value = "/{id}")
    public SpOrderGoods getSpOrderGoodsById(@PathVariable("id") Long id) {
        SpOrderGoods spOrderGoods = spOrderGoodsService.getSpOrderGoodsById(id);
        return spOrderGoods;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody SpOrderGoods spOrderGoods) {
        return spOrderGoodsService.addSpOrderGoods(spOrderGoods);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody SpOrderGoods spOrderGoods) {
        return spOrderGoodsService.updateSpOrderGoods(spOrderGoods);
    }

    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long[] ids) {
        return spOrderGoodsService.deleteSpOrderGoodsByIds(ids);
    }
}
