package com.example.springboot_shop.controller;

import com.example.springboot_shop.domain.SpAttribute;
import com.example.springboot_shop.service.ISpAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spAttribute")
public class SpAttributeController {

    @Autowired
    private ISpAttributeService spAttributeService ;


    @GetMapping("/list")
    public List<SpAttribute> list(SpAttribute spAttribute){
        List<SpAttribute> spAttributes  = spAttributeService.queryList(spAttribute);
        return spAttributes;
    }

    @GetMapping(value = "/{id}")
    public SpAttribute getSpAttributeById(@PathVariable("id") Long id){
        SpAttribute spAttribute  = spAttributeService.getSpAttributeById(id);
        return spAttribute;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody SpAttribute spAttribute){
        return spAttributeService.addSpAttribute(spAttribute);
    }


    @PutMapping("/update")
    public Boolean update(@RequestBody SpAttribute spAttribute){
        return spAttributeService.updateSpAttribute(spAttribute);
    }

    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long[] ids){
        return spAttributeService.deleteSpAttributeByIds(ids);
    }
}
