package com.resources.wu.controller;

import com.resources.wu.entity.Code;
import com.resources.wu.entity.TDiary;
import com.resources.wu.entity.TProject;
import com.resources.wu.entity.User;
import com.resources.wu.service.CodeService;
import com.resources.wu.service.TDiaryService;
import com.resources.wu.service.TProjectService;
import com.resources.wu.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Demo class
 *
 * @author
 * @date 2016/10/31
 */
@Api(tags = "test", description = "测试")
@RestController
@RequestMapping("/wu")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private TProjectService tProjectService;
    @Autowired
    private TDiaryService tDiaryService;
    @Autowired
    private CodeService codeService;
    @ApiOperation(value = "日志查询")
    @RequestMapping(  "/selectByPrimaryKeya")
    TDiary selectByPrimaryKeya( Integer dId){
        TDiary tDiary= tDiaryService.selectByPrimaryKey(dId);
        return tDiary;
    };

    @RequestMapping("/select")
    User getUserById(Integer id) {
        return userService.selectByPrimaryKey(id);
    }

    @RequestMapping("/insert")
    String insert(@RequestParam Integer id, String name, String age) {
        System.out.println(id);
        User u = new User();
        u.setId(id);
        u.setName(name);
        u.setAge(age);
        userService.insert(u);
        return "1";
    }

    @RequestMapping("/getAll")
    List<User> getByAll() {
        return userService.getByAll();
    }

    @RequestMapping("/selectByPrimaryKey")
    TProject selectByPrimaryKey(Integer id) {
        return tProjectService.selectByPrimaryKey(id);
    }
    @RequestMapping("/findByAll")
    List<TProject> findByAll(TProject tProject) {
        return tProjectService.findByAll(tProject);
    }

    @RequestMapping("/findAll")
    List<Code> findAll(Code code) {
        return codeService.findByAll(code);
    }


}


