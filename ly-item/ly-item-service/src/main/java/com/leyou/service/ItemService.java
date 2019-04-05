package com.leyou.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 商品服务
 * @author zhangpan
 * @date 2018/4/5
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.leyou.service.mapper")
public class ItemService {

    public static void main(String[] args) {
        SpringApplication.run(ItemService.class);
    }
}
