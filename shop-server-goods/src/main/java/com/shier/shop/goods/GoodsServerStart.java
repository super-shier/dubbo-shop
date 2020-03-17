package com.shier.shop.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.shier.shop.goods.mapper")
public class GoodsServerStart {
    public static void main(String[] args) {
        SpringApplication.run(GoodsServerStart.class, args);
    }
}
