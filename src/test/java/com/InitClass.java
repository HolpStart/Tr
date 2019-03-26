package com;

import com.tr.user.service.UserService;
import com.tr.user.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class InitClass {
    @Autowired
    private UserServiceImpl userService;
    public static void main(String[] args) {
        System.out.println("============"+new Date().toLocaleString() );
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springApplication.xml");
     UserServiceImpl userService=(UserServiceImpl)applicationContext.getBean("user");
     Map<String,Object> map = new HashMap<>(16);
     map.put("id",0);
      Map<String,Object> result = userService.selectById(map);

        System.out.println(result);

    }
}
