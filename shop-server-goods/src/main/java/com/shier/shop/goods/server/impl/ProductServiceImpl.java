package com.shier.shop.goods.server.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.shier.shop.goods.domain.Product;
import com.shier.shop.goods.mapper.ProductMapper;
import com.shier.shop.goods.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getAllProduct() {
        return productMapper.selectAll();
    }
}
