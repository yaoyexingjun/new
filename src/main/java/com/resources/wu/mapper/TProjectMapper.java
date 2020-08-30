package com.resources.wu.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.time.LocalDate;

import com.resources.wu.entity.TProject;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TProjectMapper {
    int insert(TProject record);

    TProject selectByPrimaryKey(Integer pId);




	List<TProject> findByAll(TProject tProject);



}