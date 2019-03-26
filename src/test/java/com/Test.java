package com;

import com.tr.mapper.user.UserDao;
import com.tr.user.service.UserService;
import com.tr.user.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class Test {


    @Autowired
    private UserService user;
   @org.junit.Test
  public void test01(){

       Map<String,Object> map = new HashMap<>(16);
       map.put("id",0);
      System.out.println(user.selectById(map));
  }
}
