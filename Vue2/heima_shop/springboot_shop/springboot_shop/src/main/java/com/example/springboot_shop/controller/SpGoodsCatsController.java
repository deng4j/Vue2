package com.example.springboot_shop.controller;

import com.example.springboot_shop.domain.SpGoodsCats;
import com.example.springboot_shop.service.ISpGoodsCatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spGoodsCats")
public class SpGoodsCatsController {

    @Autowired
    private ISpGoodsCatsService spGoodsCatsService ;

    @GetMapping("/list")
    public List<SpGoodsCats> list(SpGoodsCats spGoodsCats){
        List<SpGoodsCats> spGoodsCatss  = spGoodsCatsService.queryList(spGoodsCats);
        return spGoodsCatss;
    }

    @GetMapping(value = "/{id}")
    public SpGoodsCats getSpGoodsCatsById(@PathVariable("id") Long id){
        SpGoodsCats spGoodsCats  = spGoodsCatsService.getSpGoodsCatsById(id);
        return spGoodsCats;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody SpGoodsCats spGoodsCats){
        return spGoodsCatsService.addSpGoodsCats(spGoodsCats);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody SpGoodsCats spGoodsCats){
        return spGoodsCatsService.updateSpGoodsCats(spGoodsCats);
    }

    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long[] ids){
        return spGoodsCatsService.deleteSpGoodsCatsByIds(ids);
    }
}
