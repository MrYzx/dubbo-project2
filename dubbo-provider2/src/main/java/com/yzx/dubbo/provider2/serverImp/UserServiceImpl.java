package com.yzx.dubbo.provider2.serverImp;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yzx.dubbo.api2.server.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    @HystrixCommand
    public String getUser(){
        if(Math.random() >0.5){
            throw new RuntimeException();
        }
        return "aaaa";
    }
}
