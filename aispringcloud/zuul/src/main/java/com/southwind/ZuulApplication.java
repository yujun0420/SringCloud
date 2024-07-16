package com.southwind;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//网关
//EnableZuulProxy:包含了@EnableZuulserver，设置该类是网关的启动类。
//@EnableAutoConfiguration:可以帮助Spring Boot应用将所有符合条件的 eConfiguration 配置加载到当前Spring Boot创建并使用的loC容器中。
@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
