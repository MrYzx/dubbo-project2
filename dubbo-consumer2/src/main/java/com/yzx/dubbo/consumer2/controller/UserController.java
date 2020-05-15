package com.yzx.dubbo.consumer2.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yzx.dubbo.api2.server.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/com/yzx/user")
public class UserController {

    @Resource
    private UserService userService;

    @HystrixCommand(fallbackMethod = "getErrorInfo")
    @RequestMapping("/getUser")
    @ResponseBody
    public String getUser(){
        String b = userService.getUser();
        System.out.println("b==="+b);
        return "xiaoxi";
    }

    public String getErrorInfo(){
        System.out.println("调用容错方法！22222");
        return "进行容错处理";
    }
}
