package com.example.demo.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lixuefeng
 * @date 2020-08-24 17:38
 * @description:用户类
 */
@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private String password;
}
