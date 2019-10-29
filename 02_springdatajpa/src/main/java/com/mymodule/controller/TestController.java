package com.mymodule.controller;

import com.mymodule.entity.MyStudent;
import com.mymodule.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/aa")
    public List<MyStudent> aa(){
        System.out.println("controller --> success");
        return userService.findalll();
    }

}
