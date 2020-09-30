package com.example.demo.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.MaLocation;

import java.util.List;

/**
 * @auther CodeGenerator
 * @create 2020-09-26 20:09:39
 * @describe mapper类
 */
public interface MaLocationMapper extends BaseMapper<MaLocation> {
        List<MaLocation> selectByMano(String ma_no);
}
