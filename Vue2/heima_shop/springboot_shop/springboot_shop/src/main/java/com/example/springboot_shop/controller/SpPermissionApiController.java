package com.example.springboot_shop.controller;

import com.example.springboot_shop.domain.SpPermissionApi;
import com.example.springboot_shop.service.ISpPermissionApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spPermissionApi")
public class SpPermissionApiController {

    @Autowired
    private ISpPermissionApiService spPermissionApiService;


    @GetMapping("/list")
    public List<SpPermissionApi> list(SpPermissionApi spPermissionApi) {
        List<SpPermissionApi> spPermissionApis = spPermissionApiService.queryList(spPermissionApi);
        return spPermissionApis;
    }

    @GetMapping(value = "/{id}")
    public SpPermissionApi getSpPermissionApiById(@PathVariable("id") Long id) {
        SpPermissionApi spPermissionApi = spPermissionApiService.getSpPermissionApiById(id);
        return spPermissionApi;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody SpPermissionApi spPermissionApi) {
        return spPermissionApiService.addSpPermissionApi(spPermissionApi);
    }


    @PutMapping("/update")
    public Boolean update(@RequestBody SpPermissionApi spPermissionApi) {
        return spPermissionApiService.updateSpPermissionApi(spPermissionApi);
    }


    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long[] ids) {
        return spPermissionApiService.deleteSpPermissionApiByIds(ids);
    }
}
