package com.tr.user.service.impl;

import com.tr.mapper.user.UserDao;
import com.tr.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public Map selectById(Map<String,Object>map) {
        return userDao.selectById(map);
    }
}
