package com.example.demo.controller;

import com.example.demo.Mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author lixuefeng
 * @date 2020-08-24 18:24
 * @description:用户控制类
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;
    @GetMapping(value = "/")
    public List<User> allUser(){
        return userMapper.selectList(null);
    }
    @GetMapping(value = "users/{id}")
    public String getName(@PathVariable("id") Long id){
        return userService.getName(id);
    }
    @PostMapping(value = "users")
    public String addUser(User user){
        if(userMapper.selectById(user.getId())!=null) return "fall,caused by the id already exists";
        else return userService.addUser(user);
    }
    @GetMapping(value = "login")
    public String login(@RequestParam Long id,
                        @RequestParam String password,HttpSession session){
        HttpServletRequest servletRequest= ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        if(servletRequest.getSession().getAttribute("userSession")!=null) return "already login";
        User user=userService.checkByIdAndPassword(id,password);
        if(user==null) return "user_no isExits or the password is wrong,fail login.";
        else {
            session.setAttribute("userSession",user);
            return "success login";
        }
    }
    @GetMapping(value = "loginOut")
    public String loginOut(){
        HttpServletRequest servletRequest= ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        if(servletRequest.getSession().getAttribute("userSession")==null) return "未登录";
        servletRequest.getSession().removeAttribute("userSession");
        return "登出成功";
    }
    @GetMapping(value = "users/{id}/delete")
    public String deleteById(@PathVariable("id") Long id){
        int flag=userService.deleteById(id);
        if(flag==0) return "user id is not-exits";
        else if(flag==1) return "success delete";
        else return null;
    }
    @PostMapping(value = "users/{id}")
    public String editUser(@PathVariable("id") Long id,User user){
        User temp=userMapper.selectById(id);
        temp.setName(user.getName());
        temp.setAge(user.getAge());
        temp.setEmail(user.getEmail());
        temp.setPassword(user.getPassword());
        userService.updateById(temp);
        return null;
    }
    @GetMapping(value = "allUser")
    public List<User> showAll(){
        return userService.selectAllUser();
    }
}
