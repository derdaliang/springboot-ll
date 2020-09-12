package com.example.demo.service;

import com.example.demo.pojo.Appointment;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 预约图书表 服务类
 * </p>
 *
 * @author 李雪锋
 * @since 2020-08-28
 */
public interface AppointmentService extends IService<Appointment> {

    boolean deleteAppointment(Long bookId, Long studentId);
}
