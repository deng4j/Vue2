package com.example.springboot_shop.controller;

import com.example.springboot_shop.domain.SpUserCart;
import com.example.springboot_shop.service.ISpUserCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spUserCart")
public class SpUserCartController {

    @Autowired
    private ISpUserCartService spUserCartService ;

    @GetMapping("/list")
    public List<SpUserCart> list(SpUserCart spUserCart){
        List<SpUserCart> spUserCarts  = spUserCartService.queryList(spUserCart);
        return spUserCarts;
    }

    @GetMapping(value = "/{id}")
    public SpUserCart getSpUserCartById(@PathVariable("id") Long id){
        SpUserCart spUserCart  = spUserCartService.getSpUserCartById(id);
        return spUserCart;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody SpUserCart spUserCart){
        return spUserCartService.addSpUserCart(spUserCart);
    }


    @PutMapping("/update")
    public Boolean update(@RequestBody SpUserCart spUserCart){
        return spUserCartService.updateSpUserCart(spUserCart);
    }


    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long[] ids){
        return spUserCartService.deleteSpUserCartByIds(ids);
    }
}
