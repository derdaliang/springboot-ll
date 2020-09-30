package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.pojo.DocLine;

/**
 * @auther CodeGenerator
 * @create 2020-09-26 20:14:13
 * @describe 服务类
 */
public interface IDocLineService extends IService<DocLine> {
        public String saveOne(DocLine docLine);
}
