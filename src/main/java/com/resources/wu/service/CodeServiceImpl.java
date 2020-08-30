package com.resources.wu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.resources.wu.entity.Code;
import com.resources.wu.mapper.CodeMapper;
import com.resources.wu.service.CodeService;

import java.util.List;

@Service
public class CodeServiceImpl implements CodeService{



    @Autowired
    private CodeMapper codeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return codeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Code record) {
        return codeMapper.insert(record);
    }

    @Override
    public Code selectByPrimaryKey(Integer id) {
        return codeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Code record) {
        return codeMapper.updateByPrimaryKey(record);
    }
    @Override
    public List<Code> findByAll(Code code) {
        return codeMapper.findByAll(code);
    }
}
