package com.yzx.dubbo.api2.server;

public class UserServiceMock implements UserService {
    public UserServiceMock() {
    }

    @Override
    public String getUser() {
        return "服务调用异常！";
    }
}
