package com.resources.wu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.resources.wu.mapper.TProjectMapper;
import com.resources.wu.entity.TProject;
import com.resources.wu.service.TProjectService;

import java.util.List;

@Service
public class TProjectServiceImpl implements TProjectService{

    @Autowired
    private TProjectMapper tProjectMapper;

    @Override
    public int insert(TProject record) {
        return tProjectMapper.insert(record);
    }

    @Override
    public TProject selectByPrimaryKey(Integer pId) {
        return tProjectMapper.selectByPrimaryKey(pId);
    }

    @Override
    public List<TProject> findByAll(TProject tProject) {
        return tProjectMapper.findByAll(tProject);
    }

}
