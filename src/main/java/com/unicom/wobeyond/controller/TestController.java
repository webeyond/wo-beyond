package com.unicom.wobeyond.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "TestController",description = "测试Controller")
public class TestController {

    @ApiOperation(value = "测试接口")
	@RequestMapping("/test")
    public String test(){
        return "hello world!!!";
    }
	
}
