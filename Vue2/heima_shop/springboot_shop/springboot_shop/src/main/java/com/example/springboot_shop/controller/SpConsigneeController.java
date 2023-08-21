package com.example.springboot_shop.controller;

import com.example.springboot_shop.domain.SpConsignee;
import com.example.springboot_shop.service.ISpConsigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spConsignee")
public class SpConsigneeController {

    @Autowired
    private ISpConsigneeService spConsigneeService ;


    @GetMapping("/list")
    public List<SpConsignee> list(SpConsignee spConsignee){
        List<SpConsignee> spConsignees  = spConsigneeService.queryList(spConsignee);
        return spConsignees;
    }

    @GetMapping(value = "/{id}")
    public SpConsignee getSpConsigneeById(@PathVariable("id") Long id){
        SpConsignee spConsignee  = spConsigneeService.getSpConsigneeById(id);
        return spConsignee;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody SpConsignee spConsignee){
        return spConsigneeService.addSpConsignee(spConsignee);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody SpConsignee spConsignee){
        return spConsigneeService.updateSpConsignee(spConsignee);
    }

    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long[] ids){
        return spConsigneeService.deleteSpConsigneeByIds(ids);
    }
}
