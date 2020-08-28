package com.example.demo.pojo;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lixuefeng
 * @date 2020-08-27 14:46
 * @description:书籍类
 */
@Entity
@Data
@Table(name = "book")
public class book {
    @Id
    private Long bookId;
    private String name;
    private int number;
    private int prices;
}
