package com.shier.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shier.shop.order.IBrandService;
import com.shier.shop.order.domian.Brand;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BrandController {
    @Reference
    private IBrandService brandService;

    @ResponseBody
    @RequestMapping("/getAllBrand")
    public List<Brand> getAllBrand() {
        return brandService.getAllBrand();
    }
}
