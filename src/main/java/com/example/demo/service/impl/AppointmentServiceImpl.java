package com.example.demo.service.impl;

import com.example.demo.pojo.Appointment;
import com.example.demo.Mapper.AppointmentMapper;
import com.example.demo.service.BookService;
import com.example.demo.service.AppointmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
public class AppointmentServiceImpl extends ServiceImpl<AppointmentMapper, Appointment> implements AppointmentService {
    @Autowired
    private AppointmentMapper appointmentMapper;
    @Autowired
    private BookService bookService;
    @Override
    public boolean save(Appointment entity) {
        if(bookService.getById(entity.getBookId())==null) return false;
        if(bookService.getById(entity.getBookId()).getNumber()>0){
            if(appointmentMapper.insert(entity)==0) return false;
            bookService.ReduceNumberById(entity.getBookId());
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean deleteAppointment(Long bookId, Long studentId) {
        Appointment appointment=appointmentMapper.selectByBookIdAndStuId(bookId,studentId);
        if(appointment==null) return false;
        appointmentMapper.deleteByBookIdAndStuId(bookId,studentId);
        bookService.addNumberById(bookId);
        return true;
    }

    @Override
    public boolean updateById(Appointment entity) {
        return false;
    }
}
