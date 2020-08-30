package com.resources.wu.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.resources.wu.mapper.TDiaryMapper;
import com.resources.wu.entity.TDiary;
import com.resources.wu.service.TDiaryService;
@Service
public class TDiaryServiceImpl implements TDiaryService{

    @Resource
    private TDiaryMapper tDiaryMapper;

    @Override
    public int deleteByPrimaryKey(Integer dId) {
        return tDiaryMapper.deleteByPrimaryKey(dId);
    }

    @Override
    public int insert(TDiary record) {
        return tDiaryMapper.insert(record);
    }

    @Override
    public TDiary selectByPrimaryKey(Integer dId) {
        return tDiaryMapper.selectByPrimaryKey(dId);
    }

    @Override
    public int updateByPrimaryKey(TDiary record) {
        return tDiaryMapper.updateByPrimaryKey(record);
    }

}
