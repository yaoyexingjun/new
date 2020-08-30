package com.resources.wu.mapper;

import com.resources.wu.entity.TDiary;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TDiaryMapper {
    int deleteByPrimaryKey(Integer dId);

    int insert(TDiary record);

    TDiary selectByPrimaryKey(Integer dId);

    int updateByPrimaryKey(TDiary record);
}