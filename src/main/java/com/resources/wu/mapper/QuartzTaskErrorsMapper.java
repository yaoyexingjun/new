package com.resources.wu.mapper;

import com.resources.wu.entity.QuartzTaskErrors;

/**
 * 
 * @Description 
 * @author wutao
 * @date 2020/9/27
 */
public interface QuartzTaskErrorsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(QuartzTaskErrors record);

    int insertSelective(QuartzTaskErrors record);

    QuartzTaskErrors selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(QuartzTaskErrors record);

    int updateByPrimaryKey(QuartzTaskErrors record);
}