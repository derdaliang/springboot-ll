package com.example.demo.Mapper;

import com.example.demo.pojo.Appointment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
/**
 * <p>
 * 预约图书表 Mapper 接口
 * </p>
 *
 * @author 李雪锋
 * @since 2020-08-28
 */
public interface AppointmentMapper extends BaseMapper<Appointment> {
    @Select("select * from appointment where book_id=#{bookId} and student_id=#{studentId}")
    Appointment selectByBookIdAndStuId(Long bookId,Long studentId);
    @Delete("delete from appointment where book_id=#{bookId} and student_id=#{studentId}")
    int deleteByBookIdAndStuId(Long bookId,Long studentId);
}
