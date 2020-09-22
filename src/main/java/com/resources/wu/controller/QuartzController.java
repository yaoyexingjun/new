package com.resources.wu.controller;

import io.swagger.annotations.Api;
import org.quartz.JobKey;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo class
 *
 * @author
 * @date 2020/9/22
 */
@Api(tags = "quartzTest", description = "测试")
@RestController
@RequestMapping("/wu")
public class QuartzController {

}
