package com.demo.sys.appointment.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 预约图书表
 * </p>
 *
 * @author 李雪锋
 * @since 2020-08-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Appointment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图书ID
     */
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
