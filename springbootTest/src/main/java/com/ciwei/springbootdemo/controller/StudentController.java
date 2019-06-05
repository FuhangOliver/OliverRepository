package com.ciwei.springbootdemo.controller;

import com.ciwei.springbootdemo.mapper.StudentMapper;
import com.ciwei.springbootdemo.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Student 控制器
 * @author 11701
 */
@Controller
public class StudentController {

    @Autowired
    StudentMapper studentMapper;//当Autowired报错的时候
    // 方法1：在mapper文件上加@Repository注解，这是从spring2.0新增的一个注解，
    // 用于简化 Spring 的开发，实现数据访问
    //方法2：在mapper文件上加@Component注解，把普通pojo实例化到spring容器中，
    // 相当于配置文件中的<bean id="" class=""/>

    @RequestMapping("/listStudent")
    public String listStudent(Model model) {
        List<Student> students = studentMapper.findAll();
        model.addAttribute("students", students);
        return "listStudent";
    }
}
