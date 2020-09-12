package com.example.demo.pojo;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>
 * 预约图书表
 * </p>
 *
 * @author 李雪锋
 * @since 2020-08-28
 */
@Entity
@Data
@Table(name = "appointment")
public class Appointment {

    /**
     * 图书ID
     */
    @Id
    private Long bookId;

    /**
     * 学号
     */
    private Long studentId;

    /**
     * 预约时间
     */
    private LocalDateTime appointTime;


}
