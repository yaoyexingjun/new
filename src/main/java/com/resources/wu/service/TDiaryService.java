package com.resources.wu.service;

import com.resources.wu.entity.TDiary;
public interface TDiaryService{


    int deleteByPrimaryKey(Integer dId);

    int insert(TDiary record);

    TDiary selectByPrimaryKey(Integer dId);

    int updateByPrimaryKey(TDiary record);

}
