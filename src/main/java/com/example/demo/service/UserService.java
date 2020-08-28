package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;

public interface UserService  {
    List<User> selectAllUser();
    String getName(Long id);
    String addUser(User user);
    int checkByIdAndPassword(Long id,String password);
    int deleteById(Long id);
    int updateById(User user);
}
