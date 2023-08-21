package com.example.springboot_shop.controller;

import com.example.springboot_shop.domain.SpReport2;
import com.example.springboot_shop.service.ISpReport2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spReport2")
public class SpReport2Controller {

    @Autowired
    private ISpReport2Service spReport2Service ;

    @GetMapping("/list")
    public List<SpReport2> list(SpReport2 spReport2){
        List<SpReport2> spReport2s  = spReport2Service.queryList(spReport2);
        return spReport2s;
    }

    @GetMapping(value = "/{id}")
    public SpReport2 getSpReport2ById(@PathVariable("id") Long id){
        SpReport2 spReport2  = spReport2Service.getSpReport2ById(id);
        return spReport2;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody SpReport2 spReport2){
        return spReport2Service.addSpReport2(spReport2);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody SpReport2 spReport2){
        return spReport2Service.updateSpReport2(spReport2);
    }

    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long[] ids){
        return spReport2Service.deleteSpReport2ByIds(ids);
    }
}
