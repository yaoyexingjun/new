package com.resources.wu.service;

import com.resources.wu.entity.Code;

import java.util.List;

public interface CodeService{


    int deleteByPrimaryKey(Integer id);

    int insert(Code record);

    Code selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Code record);
    List<Code> findByAll(Code code);
}
