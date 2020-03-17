package com.shier.shop.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.shier.shop.order.mapper")
public class OrderServerStart {
    public static void main(String[] args) {
        SpringApplication.run(OrderServerStart.class, args);
    }
}
