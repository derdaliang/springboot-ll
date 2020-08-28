package com.example.demo.service.impl;

import com.example.demo.Mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lixuefeng
 * @date 2020-08-25 15:43
 * @description:用户服务实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAllUser() {
        return userMapper.selectList(null);
    }

    @Override
    public String getName(Long id) {
        return userMapper.selectById(id).getName();
    }

    @Override
    public String addUser(User user) {
        if(userMapper.insert(user)>0) return "success";
        else return "fall";
    }

    @Override
    public int checkByIdAndPassword(Long id, String password) {
        if(userMapper.selectById(id)==null) return 0;
        else if(!userMapper.selectById(id).getPassword().equals(password)) return 1;
        else return 2;
    }

    @Override
    public int deleteById(Long id) {
        if(userMapper.selectById(id)==null) return 0;
        userMapper.deleteById(id);
        return 1;
    }

    @Override
    public int updateById(User user) {
        return userMapper.updateById(user);
    }
}
