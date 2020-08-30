package com.resources.wu.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.resources.wu.entity.Code;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CodeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Code record);
//@Select("select*from code where id = #{id}")
    Code selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Code record);
    List<Code> findByAll(Code code);







}