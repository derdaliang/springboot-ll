package com.example.demo.controller;


import com.example.demo.pojo.Appointment;
import com.example.demo.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 预约图书表 前端控制器
 * </p>
 *
 * @author 李雪锋
 * @since 2020-08-28
 */
@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;
    @PostMapping(value = "add")
    public String addBook(Appointment appointment){
        if(appointmentService.save(appointment))
            return "success add";
        else
            return "fail add";
    }
    @PostMapping(value = "/cancel")
    public String cancelAppointment(@RequestParam Long bookId,
                                    @RequestParam Long studentId){
        if(appointmentService.deleteAppointment(bookId, studentId)){
            return "appointment is cancelled";
        }else{
            return "appointment cancel fail";
        }
    }
    @GetMapping(value = "/showAllAppointment")
    public List<Appointment> showAllAppointment(){
        return appointmentService.list(null);
    }
}
