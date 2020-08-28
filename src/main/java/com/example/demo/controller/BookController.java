package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.Mapper.BookMapper;
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
    @Autowired
    private BookMapper bookMapper;
    @GetMapping(value = "/books")
    public List<book> allBooks(){
        return bookService.queryAllBooks();
    }
    @PostMapping(value = "/list")
    public IPage<book> listBooks(@RequestParam long size, @RequestParam long pages){
        IPage<book> page=new Page<>(pages,size);
        return bookService.selectBookPage(page);
    }
    @PostMapping(value = "/update/{id}")
    public int updateBook(@PathVariable("id")Long id,book b){
        QueryWrapper<book> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("book_id",id);//更新的条件
        return bookMapper.update(b,queryWrapper);
    }
    @PostMapping(value = "add")
    public String addBook(book b){
        return bookService.addBook(b);
    }
}
