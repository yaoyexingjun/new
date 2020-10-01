package com.resources.wu.mapper;

import com.resources.wu.entity.QuartzTaskInformations;

/**
 * 
 * @Description 
 * @author wutao
 * @date 2020/9/27
 */
public interface QuartzTaskInformationsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(QuartzTaskInformations record);

    int insertSelective(QuartzTaskInformations record);

    QuartzTaskInformations selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(QuartzTaskInformations record);

    int updateByPrimaryKey(QuartzTaskInformations record);
}