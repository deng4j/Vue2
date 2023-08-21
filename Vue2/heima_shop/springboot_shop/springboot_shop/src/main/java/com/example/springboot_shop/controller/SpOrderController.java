package com.example.springboot_shop.controller;

import com.example.springboot_shop.domain.SpOrder;
import com.example.springboot_shop.service.ISpOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spOrder")
public class SpOrderController {

    @Autowired
    private ISpOrderService spOrderService;

    @GetMapping("/list")
    public List<SpOrder> list(SpOrder spOrder) {
        List<SpOrder> spOrders = spOrderService.queryList(spOrder);
        return spOrders;
    }

    @GetMapping(value = "/{id}")
    public SpOrder getSpOrderById(@PathVariable("id") Long id) {
        SpOrder spOrder = spOrderService.getSpOrderById(id);
        return spOrder;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody SpOrder spOrder) {
        return spOrderService.addSpOrder(spOrder);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody SpOrder spOrder) {
        return spOrderService.updateSpOrder(spOrder);
    }

    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long[] ids) {
        return spOrderService.deleteSpOrderByIds(ids);
    }
}
