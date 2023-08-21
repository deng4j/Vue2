package com.example.springboot_shop.controller;

import com.example.springboot_shop.domain.SpExpress;
import com.example.springboot_shop.service.ISpExpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spExpress")
public class SpExpressController {

    @Autowired
    private ISpExpressService spExpressService ;

    @GetMapping("/list")
    public List<SpExpress> list(SpExpress spExpress){
        List<SpExpress> spExpresss  = spExpressService.queryList(spExpress);
        return spExpresss;
    }

    @GetMapping(value = "/{id}")
    public SpExpress getSpExpressById(@PathVariable("id") Long id){
        SpExpress spExpress  = spExpressService.getSpExpressById(id);
        return spExpress;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody SpExpress spExpress){
        return spExpressService.addSpExpress(spExpress);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody SpExpress spExpress){
        return spExpressService.updateSpExpress(spExpress);
    }

    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long[] ids){
        return spExpressService.deleteSpExpressByIds(ids);
    }
}
