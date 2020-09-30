package com.example.demo.controller;


import com.example.demo.pojo.DocHead;
import com.example.demo.pojo.User;
import com.example.demo.service.IDocHeadService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @auther CodeGenerator
 * @create 2020-09-26 20:14:13
 * @describe 前端控制器
 */
@RestController
@RequestMapping("/goods/doc-head")
public class DocHeadController {
    @Autowired
    private IDocHeadService docHeadService;
    @Autowired
    private UserService userService;
    @GetMapping(value = "/all")
    public List<DocHead> getAll(){
        return docHeadService.list();
    }
    @PostMapping(value = "/add")
    public String add(DocHead docHead){
        User user=userService.getLoginSession();
        if(user==null) return "user not login,please login in";
        if(docHeadService.save(docHead,user)){
            return "success add";
        }else{
            return "fail";
        }
    }
    @GetMapping(value = "/remove")
    public String remove(@RequestParam("id") String id){
        if(docHeadService.removeById(id)) return "success";
        return "fail";
    }
    @PostMapping(value = "update")
    public String update(DocHead docHead){
        if(docHeadService.updateById(docHead)) return "success";
        return "fail";
    }
}

