package com.cdlgdxgcjsxy.asset_management.service.impl;

import com.cdlgdxgcjsxy.asset_management.mapper.UserDao.UserMapper;
import com.cdlgdxgcjsxy.asset_management.pojo.User;
import com.cdlgdxgcjsxy.asset_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User queryByUser(Integer id) {
        User user = userMapper.selectById(id);
        return user;
    }

    @Override
    public Integer insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public User queryUser(User user) {
        return userMapper.selectByUser(user);
    }
}
