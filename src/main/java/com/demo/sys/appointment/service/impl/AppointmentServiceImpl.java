package com.demo.sys.appointment.service.impl;

import com.demo.sys.appointment.entity.Appointment;
import com.demo.sys.appointment.mapper.AppointmentMapper;
import com.demo.sys.appointment.service.IAppointmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 预约图书表 服务实现类
 * </p>
 *
 * @author 李雪锋
 * @since 2020-08-28
 */
@Service
public class AppointmentServiceImpl extends ServiceImpl<AppointmentMapper, Appointment> implements IAppointmentService {

}
