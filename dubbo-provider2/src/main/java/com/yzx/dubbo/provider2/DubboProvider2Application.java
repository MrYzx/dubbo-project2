package com.yzx.dubbo.provider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableHystrix
@ImportResource(locations = {"classpath:dubbo-provider.xml"})
public class DubboProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(DubboProvider2Application.class, args);
    }

}
