package com.resources.wu.mapper;

import com.resources.wu.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * Demo class
 *
 * @author
 * @date 2016/10/31
 */
@Mapper
public interface UserMapper {
    /**
     * 添加
     *
     * @param record
     * @return
     */
    int insert(User record);
    /**
     * 查询根据id
     *
     * @param id
     * @return
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 查询全部
     *
     * @return
     */
    List<User> getByAll();

}