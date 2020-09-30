package com.example.demo.controller;


import com.example.demo.pojo.MaLocation;
import com.example.demo.service.IMaLocationService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @auther CodeGenerator
 * @create 2020-09-26 20:09:39
 * @describe 前端控制器
 */
@RestController
@RequestMapping("/goods/ma-location")
public class MaLocationController {
    @Autowired
    private IMaLocationService maLocationService;
    @GetMapping(value = "/all")
    public List<MaLocation> getAll(){
        return maLocationService.list();
    }
    @PostMapping(value = "/add")
    public String add(MaLocation maLocation){
        if(maLocationService.save(maLocation)){
            return "success add";
        }else{
            return "fail";
        }
    }
    @GetMapping(value = "/remove")
    public String remove(@RequestParam("mt_area") String mt_area){
        if(maLocationService.removeById(mt_area)) return "success";
        return "fail";
    }
    @PostMapping(value = "update")
    public String update(MaLocation maLocation){
        if(maLocationService.updateById(maLocation)) return "success";
        return "fail";
    }
}

