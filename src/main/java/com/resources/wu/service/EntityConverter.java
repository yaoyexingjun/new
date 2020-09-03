package com.resources.wu.service;

import com.resources.wu.entity.UserDto;
import com.resources.wu.entity.UserVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 实体转换接口
 *
 * @author
 * @date 2020/9/3
 */

@Mapper(componentModel = "spring")
public interface EntityConverter {
    /**
     *  通过反射获得此接口的实例对象
     */
    EntityConverter entityConverter  = Mappers.getMapper(EntityConverter.class);

    /**
     * 这个注解是把不对应的属性名对应起来
     */
    @Mappings(@Mapping(source = "username",target = "name"))
    UserDto votoDto(UserVo userVo);

    List<UserDto> votoListDto(List<UserVo> list);
}
