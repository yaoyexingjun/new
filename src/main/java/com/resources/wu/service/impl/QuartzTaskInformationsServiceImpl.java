package com.resources.wu.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.resources.wu.entity.QuartzTaskInformations;
import com.resources.wu.mapper.QuartzTaskInformationsMapper;
import com.resources.wu.service.QuartzTaskInformationsService;
/**
 * 
 * @Description 
 * @author wutao
 * @date 2020/9/27
 */
@Service
public class QuartzTaskInformationsServiceImpl implements QuartzTaskInformationsService{

    @Resource
    private QuartzTaskInformationsMapper quartzTaskInformationsMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return quartzTaskInformationsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(QuartzTaskInformations record) {
        return quartzTaskInformationsMapper.insert(record);
    }

    @Override
    public int insertSelective(QuartzTaskInformations record) {
        return quartzTaskInformationsMapper.insertSelective(record);
    }

    @Override
    public QuartzTaskInformations selectByPrimaryKey(Long id) {
        return quartzTaskInformationsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(QuartzTaskInformations record) {
        return quartzTaskInformationsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(QuartzTaskInformations record) {
        return quartzTaskInformationsMapper.updateByPrimaryKey(record);
    }

}
