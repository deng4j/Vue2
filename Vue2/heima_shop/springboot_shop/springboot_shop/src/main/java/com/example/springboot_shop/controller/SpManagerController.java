package com.example.springboot_shop.controller;

import com.example.springboot_shop.domain.SpManager;
import com.example.springboot_shop.service.ISpManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spManager")
public class SpManagerController {

    @Autowired
    private ISpManagerService spManagerService ;

    @GetMapping("/list")
    public List<SpManager> list(SpManager spManager){
        List<SpManager> spManagers  = spManagerService.queryList(spManager);
        return spManagers;
    }

    @GetMapping(value = "/{id}")
    public SpManager getSpManagerById(@PathVariable("id") Long id){
        SpManager spManager  = spManagerService.getSpManagerById(id);
        return spManager;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody SpManager spManager){
        return spManagerService.addSpManager(spManager);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody SpManager spManager){
        return spManagerService.updateSpManager(spManager);
    }

    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long[] ids){
        return spManagerService.deleteSpManagerByIds(ids);
    }
}
