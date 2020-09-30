package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.pojo.DocHead;
import com.example.demo.pojo.User;

/**
 * @auther CodeGenerator
 * @create 2020-09-26 20:14:13
 * @describe 服务类
 */
public interface IDocHeadService extends IService<DocHead> {
        boolean save(DocHead docHead, User user);
}
