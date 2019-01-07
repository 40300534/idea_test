package com.itheima.controller;

import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class test1 {
    @Autowired
    private UserService service;

    @RequestMapping(value = "findAll")
    public String findAll(Model model) {
        System.out.println("222");
        return null;
    }
}
