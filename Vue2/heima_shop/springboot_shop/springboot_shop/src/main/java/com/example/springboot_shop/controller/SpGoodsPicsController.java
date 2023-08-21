package com.example.springboot_shop.controller;

import com.example.springboot_shop.domain.SpGoodsPics;
import com.example.springboot_shop.service.ISpGoodsPicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spGoodsPics")
public class SpGoodsPicsController {

    @Autowired
    private ISpGoodsPicsService spGoodsPicsService ;

    @GetMapping("/list")
    public List<SpGoodsPics> list(SpGoodsPics spGoodsPics){
        List<SpGoodsPics> spGoodsPicss  = spGoodsPicsService.queryList(spGoodsPics);
        return spGoodsPicss;
    }

    @GetMapping(value = "/{id}")
    public SpGoodsPics getSpGoodsPicsById(@PathVariable("id") Long id){
        SpGoodsPics spGoodsPics  = spGoodsPicsService.getSpGoodsPicsById(id);
        return spGoodsPics;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody SpGoodsPics spGoodsPics){
        return spGoodsPicsService.addSpGoodsPics(spGoodsPics);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody SpGoodsPics spGoodsPics){
        return spGoodsPicsService.updateSpGoodsPics(spGoodsPics);
    }

    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long[] ids){
        return spGoodsPicsService.deleteSpGoodsPicsByIds(ids);
    }
}
