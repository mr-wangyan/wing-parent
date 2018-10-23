package com.self.wing.boot.controller;

import com.self.wing.boot.config.StudentProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * spring-boot test controller
 *
 * @author Wing created on 2018/10/22
 */
@Controller
@RequestMapping(value = "/spring/boot")
public class SpringBootTestController {

    @RequestMapping(value = "/hello")
    public String hello(Model model) {

        model.addAttribute("now", System.currentTimeMillis());
        List<StudentProperties> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            StudentProperties studentProperties = new StudentProperties();
            studentProperties.setName("张三" + i);
            studentProperties.setAge(20 + i);
            userList.add(studentProperties);
        }
        model.addAttribute("users", userList);
        return "hello";
    }
}
