package com.shier.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shier.shop.goods.domain.Product;
import com.shier.shop.goods.service.IProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {

    @Reference
    private IProductService productService;

    @ResponseBody
    @RequestMapping("/getAllProduct")
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }
}
