package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.Mapper.MaLocationMapper;
import com.example.demo.pojo.MaLocation;
import com.example.demo.service.IMaLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther CodeGenerator
 * @create 2020-09-26 20:09:39
 * @describe 服务实现类
 */
@Service
public class MaLocationServiceImpl extends ServiceImpl<MaLocationMapper, MaLocation> implements IMaLocationService {
        @Autowired
        private MaLocationMapper maLocationMapper;
        @Override
        public List<MaLocation> selectByMano(String ma_no) {
                return maLocationMapper.selectByMano(ma_no);
        }
}
