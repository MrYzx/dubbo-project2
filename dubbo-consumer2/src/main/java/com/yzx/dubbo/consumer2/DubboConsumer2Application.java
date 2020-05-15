package com.yzx.dubbo.consumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;
@SpringBootApplication
@EnableHystrix
@ImportResource(locations = {"classpath:dubbo-consumer.xml"})
public class DubboConsumer2Application {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumer2Application.class, args);
    }

}
