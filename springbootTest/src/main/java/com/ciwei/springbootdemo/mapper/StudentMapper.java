package com.ciwei.springbootdemo.mapper;

import com.ciwei.springbootdemo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface StudentMapper {

    @Select("SELECT * FROM student")
    List<Student> findAll();
}
