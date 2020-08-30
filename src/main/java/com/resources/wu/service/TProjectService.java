package com.resources.wu.service;

import com.resources.wu.entity.TProject;

import java.util.List;

public interface TProjectService  {


    int insert(TProject record);

    TProject selectByPrimaryKey(Integer pId);
    List<TProject> findByAll(TProject tProject);
}
