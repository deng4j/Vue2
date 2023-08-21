package com.example.springboot_shop.controller;

import com.example.springboot_shop.domain.SpReport3;
import com.example.springboot_shop.service.ISpReport3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spReport3")
public class SpReport3Controller {

    @Autowired
    private ISpReport3Service spReport3Service ;

    @GetMapping("/list")
    public List<SpReport3> list(SpReport3 spReport3){
        List<SpReport3> spReport3s  = spReport3Service.queryList(spReport3);
        return spReport3s;
    }

    @GetMapping(value = "/{id}")
    public SpReport3 getSpReport3ById(@PathVariable("id") Long id){
        SpReport3 spReport3  = spReport3Service.getSpReport3ById(id);
        return spReport3;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody SpReport3 spReport3){
        return spReport3Service.addSpReport3(spReport3);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody SpReport3 spReport3){
        return spReport3Service.updateSpReport3(spReport3);
    }

    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long[] ids){
        return spReport3Service.deleteSpReport3ByIds(ids);
    }
}
