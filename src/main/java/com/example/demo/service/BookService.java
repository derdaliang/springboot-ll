package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.pojo.book;

import java.util.List;

/**
 * @author lixuefeng
 * @date 2020-08-27 14:50
 * @description:书籍服务类
 */
public interface BookService extends IService<book> {
    Long getIdByName(String name);
    List<book> queryAllBooks();
    IPage<book> selectBookPage(IPage<book> page);
    String addBook(book entity);
}
