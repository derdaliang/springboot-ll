package com.example.demo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.Mapper.BookMapper;
import com.example.demo.Mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.pojo.book;
import com.example.demo.service.BookService;
import com.example.demo.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author lixuefeng
 * @date 2020-08-24 17:46
 * @description:测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {
    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private BookService bookService;
    @Autowired
    private UserService userService;
    @Test
    public void testSelect(){
        System.out.println("-----selectAll method test----");
        List<book> userList=bookService.queryAllBooks();
////        Assert.assertEquals(5,userList.size());
//        userList.forEach(System.out::println);
        IPage<book> page = new Page<>(1, 2);
        page=bookMapper.selectPage(page,null);
        long total = page.getTotal();
        System.out.println("总条数：" + total);
        page.getRecords().forEach(book -> System.out.println("user: " + book));
    }
}
