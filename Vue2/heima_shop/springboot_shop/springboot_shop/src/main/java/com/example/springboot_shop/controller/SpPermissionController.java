package com.example.springboot_shop.controller;

import com.example.springboot_shop.domain.SpPermission;
import com.example.springboot_shop.service.ISpPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spPermission")
public class SpPermissionController {

    @Autowired
    private ISpPermissionService spPermissionService ;

    @GetMapping("/list")
    public List<SpPermission> list(SpPermission spPermission){
        List<SpPermission> spPermissions  = spPermissionService.queryList(spPermission);
        return spPermissions;
    }

    @GetMapping(value = "/{id}")
    public SpPermission getSpPermissionById(@PathVariable("id") Long id){
        SpPermission spPermission  = spPermissionService.getSpPermissionById(id);
        return spPermission;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody SpPermission spPermission){
        return spPermissionService.addSpPermission(spPermission);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody SpPermission spPermission){
        return spPermissionService.updateSpPermission(spPermission);
    }

    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long[] ids){
        return spPermissionService.deleteSpPermissionByIds(ids);
    }
}
