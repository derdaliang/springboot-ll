package com.example.demo.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.pojo.book;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface BookMapper extends BaseMapper<book> {
    @Select("select book_id from book  where name like #{name}")
    Long findIdByName(String name);
//    @Update("")
//    int updateById();
    IPage<book> selectPageVo(Page<?> page);
}
