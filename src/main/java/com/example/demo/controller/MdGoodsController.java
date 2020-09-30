package com.example.demo.controller;


import com.example.demo.pojo.MdGoods;
import com.example.demo.service.IMdGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @auther CodeGenerator
 * @create 2020-09-26 20:06:18
 * @describe 前端控制器
 */
@RestController
@RequestMapping("/goods/md-goods")
public class MdGoodsController {
    @Autowired
    private IMdGoodsService mdGoodsService;
    @GetMapping(value = "/getAll")
    public  List<MdGoods> getAll(){
        return mdGoodsService.list();
    }
    @PostMapping(value = "/add")
    public String addGoods(MdGoods mdGoods){
        return mdGoodsService.addGoods(mdGoods);
    }
    @GetMapping(value = "/selectByShp")
    public List<MdGoods> selectBy(@RequestParam("shpGuiGe") String string){
        return mdGoodsService.selectByShpGuiGe(string);
    }
    @PostMapping(value = "/select")
    public List<MdGoods> selectByMany(MdGoods mdGoods){
        return mdGoodsService.selectByMany(mdGoods);
    }
}

