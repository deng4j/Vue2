package com.example.springboot_shop.controller;

import com.example.springboot_shop.domain.SpType;
import com.example.springboot_shop.service.ISpTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spType")
public class SpTypeController {

    @Autowired
    private ISpTypeService spTypeService ;

    @GetMapping("/list")
    public List<SpType> list(SpType spType){
        List<SpType> spTypes  = spTypeService.queryList(spType);
        return spTypes;
    }

    @GetMapping(value = "/{id}")
    public SpType getSpTypeById(@PathVariable("id") Long id){
        SpType spType  = spTypeService.getSpTypeById(id);
        return spType;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody SpType spType){
        return spTypeService.addSpType(spType);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody SpType spType){
        return spTypeService.updateSpType(spType);
    }

    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long[] ids){
        return spTypeService.deleteSpTypeByIds(ids);
    }
}
