package com.example.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.pojo.book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lixuefeng
 * @date 2020-08-27 14:52
 * @description:书籍控制类
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping(value = "/books")
    public List<book> allBooks(){
        return bookService.queryAllBooks();
    }
    @PostMapping(value = "/list")
    public IPage<book> listBooks(@RequestParam long size, @RequestParam long pages){
        IPage<book> page=new Page<>(pages,size);
        return bookService.selectBookPage(page);
    }
}
