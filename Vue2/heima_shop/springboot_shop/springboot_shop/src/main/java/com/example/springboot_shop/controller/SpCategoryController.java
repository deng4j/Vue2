package com.example.springboot_shop.controller;

import com.example.springboot_shop.domain.SpCategory;
import com.example.springboot_shop.service.ISpCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spCategory")
public class SpCategoryController {

    @Autowired
    private ISpCategoryService spCategoryService;


    @GetMapping("/list")
    public List<SpCategory> list(SpCategory spCategory) {
        List<SpCategory> spCategorys = spCategoryService.queryList(spCategory);
        return spCategorys;
    }

    @GetMapping(value = "/{id}")
    public SpCategory getSpCategoryById(@PathVariable("id") Long id) {
        SpCategory spCategory = spCategoryService.getSpCategoryById(id);
        return spCategory;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody SpCategory spCategory) {
        return spCategoryService.addSpCategory(spCategory);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody SpCategory spCategory) {
        return spCategoryService.updateSpCategory(spCategory);
    }


    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long[] ids) {
        return spCategoryService.deleteSpCategoryByIds(ids);
    }
}
