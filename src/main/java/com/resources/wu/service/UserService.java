package com.resources.wu.service;

import com.resources.wu.entity.User;

import java.util.List;
/**
 * Demo class
 *
 * @author
 * @date 2016/10/31
 */
public interface UserService {

    /**
     * 添加
     *
     * @param record
     * @return
     */
    int insert(User record);

    /**
     * 查询全部
     *
     * @return 集合
     */
    List<User> getByAll();


    /**
     * 查询根据id
     *
     * @param id
     * @return
     */
    User selectByPrimaryKey(Integer id);
}


