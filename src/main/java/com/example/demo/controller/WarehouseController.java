package com.example.demo.controller;


import com.example.demo.pojo.Warehouse;
import com.example.demo.service.IWarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @auther CodeGenerator
 * @create 2020-09-26 20:10:51
 * @describe 前端控制器
 */
@RestController
@RequestMapping("/goods/warehouse")
public class WarehouseController {
    @Autowired
    private IWarehouseService warehouseService;
    @GetMapping(value = "/all")
    public List<Warehouse> getAll(){
        return warehouseService.list();
    }
    @PostMapping(value = "/add")
    public String add(Warehouse warehouse){
        if(warehouseService.save(warehouse)){
            return "success add";
        }else{
            return "fail";
        }
    }
    @GetMapping(value = "/remove")
    public String remove(@RequestParam("ma_no") String ma_no){
        if(warehouseService.removeById(ma_no)) return "success";
        return "fail";
    }
    @PostMapping(value = "update")
    public String update(Warehouse warehouse){
        if(warehouseService.updateById(warehouse)) return "success";
        return "fail";
    }
}

