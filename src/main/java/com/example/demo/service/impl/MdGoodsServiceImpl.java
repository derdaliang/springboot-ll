package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.Mapper.MdGoodsMapper;
import com.example.demo.pojo.MdGoods;
import com.example.demo.service.IMdGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @auther CodeGenerator
 * @create 2020-09-26 20:06:18
 * @describe 服务实现类
 */
@Service
public class MdGoodsServiceImpl extends ServiceImpl<MdGoodsMapper, MdGoods> implements IMdGoodsService {
        @Autowired
        private MdGoodsMapper mdGoodsMapper;
        public String addGoods(MdGoods mdGoods){
                if(mdGoodsMapper.insert(mdGoods)>0) return "add goods success~";
                return "add fail,come on";
        }
        public List<MdGoods> selectByShpGuiGe(String string){
                List<MdGoods> list=mdGoodsMapper.selectByShpGuiGe(string);
                return list;
        }

        @Override
        public List<MdGoods> selectByMany(MdGoods mdGoods) {
                List<MdGoods> list=mdGoodsMapper.selectByMany(mdGoods);
                return list;
        }
}
