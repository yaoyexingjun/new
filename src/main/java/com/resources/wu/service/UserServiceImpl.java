package com.resources.wu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.resources.wu.entity.User;
import com.resources.wu.mapper.UserMapper;
import com.resources.wu.service.UserService;

import java.util.List;

/**
 * Demo class
 *
 * @author
 * @date 2016/10/31
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }


    @Override
    public List<User> getByAll() {
        return userMapper.getByAll();
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}


