package com.mubole.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description: Eureka启动类
 * @Author: fanmanfu
 * @CreateDate: 2019/6/24 0024 10:06
 * @UpdateUser: fanmanfu
 * @UpdateDate: 2019/6/24 0024 10:06
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */

@EnableEurekaServer //标识一个Eureka Server服务注册中心
@SpringBootApplication
public class EurekaApplication {
    public static void main(String[] args) {
    SpringApplication.run(EurekaApplication.class, args);
    }
}
