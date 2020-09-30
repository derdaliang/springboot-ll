package com.example.demo.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.MdGoods;
import java.util.List;

/**
 * @auther CodeGenerator
 * @create 2020-09-26 20:06:18
 * @describe mapper类
 */
public interface MdGoodsMapper extends BaseMapper<MdGoods> {
        List<MdGoods> selectByShpGuiGe(String string);
        List<MdGoods> selectByMany(MdGoods mdGoods);
}
