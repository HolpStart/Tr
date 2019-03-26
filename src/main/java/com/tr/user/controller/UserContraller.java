package com.tr.user.controller;

import com.tr.user.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserContraller {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/getInfo")
    public Object getUserInfo(@RequestParam Map<String,Object> map){
        return userService.selectById(map);
    }
}
