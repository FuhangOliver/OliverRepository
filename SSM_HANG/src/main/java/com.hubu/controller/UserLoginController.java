package com.hubu.controller;

import com.hubu.service.UserLoginService;
import com.hubu.model.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

@Controller
@RequestMapping("/user1")
public class UserLoginController {

    @Autowired
    UserLoginService userLoginService;

    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        System.out.println("账号密码：" + name + ":" + password);
        ModelAndView modelAndView;
        try {
            UserLogin userLogin = userLoginService.findUser(name, password);
            System.out.println("账号密码：" + userLogin.getId() + ":" + userLogin.getName() + ":" + userLogin.getPassword());
            Objects.requireNonNull(userLogin);
            modelAndView = new ModelAndView("pages/hello");
            modelAndView.addObject("id", userLogin.getId());
            modelAndView.addObject("name", userLogin.getName());
        } catch (Exception e) {
            System.out.println("错误是：" + e);
            modelAndView = new ModelAndView("pages/login");
            modelAndView.addObject("info", "您的账号或密码错误，请输入正确的账号和密码");
        }
        return modelAndView;
    }
}
