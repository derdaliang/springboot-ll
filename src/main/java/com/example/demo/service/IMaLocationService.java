package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.pojo.MaLocation;

import java.util.List;

/**
 * @auther CodeGenerator
 * @create 2020-09-26 20:09:39
 * @describe 服务类
 */
public interface IMaLocationService extends IService<MaLocation> {
        List<MaLocation> selectByMano(String ma_no);
}
