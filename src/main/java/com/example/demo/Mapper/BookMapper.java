package com.example.demo.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.pojo.book;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
public interface BookMapper extends BaseMapper<book> {
    //mybatis-plus 自定义sql的两种方式：1通过注解
    @Select("select book_id from book  where name=#{name}")
    Long findIdByName(String name);
//    @Update("")
//    int updateById();
    //2.通过xml配置文件
    IPage<book> selectPageVo(Page<?> page);
    @Update("update book set number=number-1 where book_id=#{bookId}")
    boolean reduceNumber(Long bookId);
    @Update("update book set number=number+1 where book_id=#{bookId}")
    boolean addNumber(Long bookId);
    @Select("select * from book where book_id=#{bookId}")
    book selectById(Long bookId);
}
