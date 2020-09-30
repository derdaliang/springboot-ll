package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.pojo.MdGoods;

import java.util.Date;
import java.util.List;

/**
 * @auther CodeGenerator
 * @create 2020-09-26 20:06:18
 * @describe 服务类
 */
public interface IMdGoodsService extends IService<MdGoods> {
        String addGoods(MdGoods mdGoods);
        List<MdGoods> selectByShpGuiGe(String string);
        List<MdGoods> selectByMany(MdGoods mdGoods);
}
