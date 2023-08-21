package com.example.springboot_shop.controller;

import com.example.springboot_shop.domain.SpRole;
import com.example.springboot_shop.service.ISpRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spRole")
public class SpRoleController {

    @Autowired
    private ISpRoleService spRoleService;


    @GetMapping("/list")
    public List<SpRole> list(SpRole spRole) {
        List<SpRole> spRoles = spRoleService.queryList(spRole);
        return spRoles;
    }

    @GetMapping(value = "/{id}")
    public SpRole getSpRoleById(@PathVariable("id") Long id) {
        SpRole spRole = spRoleService.getSpRoleById(id);
        return spRole;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody SpRole spRole) {
        return spRoleService.addSpRole(spRole);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody SpRole spRole) {
        return spRoleService.updateSpRole(spRole);
    }


    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long[] ids) {
        return spRoleService.deleteSpRoleByIds(ids);
    }
}
