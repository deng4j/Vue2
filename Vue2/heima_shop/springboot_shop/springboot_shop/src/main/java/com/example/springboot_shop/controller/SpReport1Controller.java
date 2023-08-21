package com.example.springboot_shop.controller;

import com.example.springboot_shop.domain.SpReport1;
import com.example.springboot_shop.service.ISpReport1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spReport1")
public class SpReport1Controller {

    @Autowired
    private ISpReport1Service spReport1Service;

    @GetMapping("/list")
    public List<SpReport1> list(SpReport1 spReport1) {
        List<SpReport1> spReport1s = spReport1Service.queryList(spReport1);
        return spReport1s;
    }

    @GetMapping(value = "/{id}")
    public SpReport1 getSpReport1ById(@PathVariable("id") Long id) {
        SpReport1 spReport1 = spReport1Service.getSpReport1ById(id);
        return spReport1;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody SpReport1 spReport1) {
        return spReport1Service.addSpReport1(spReport1);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody SpReport1 spReport1) {
        return spReport1Service.updateSpReport1(spReport1);
    }

    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long[] ids) {
        return spReport1Service.deleteSpReport1ByIds(ids);
    }
}
