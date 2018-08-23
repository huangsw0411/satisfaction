package com.hzit.satisfaction.service.impl;

import com.hzit.satisfaction.entity.User;
import com.hzit.satisfaction.mapper.UserMapper;
import com.hzit.satisfaction.service.UserService;
import com.hzit.satisfaction.tools.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(User user) {
        Map map= Tools.convertBeanToMap(user);
        List<User> list= userMapper.searchUserByParams(map);
        return list.size()==1?list.get(0):null;

    }
}
