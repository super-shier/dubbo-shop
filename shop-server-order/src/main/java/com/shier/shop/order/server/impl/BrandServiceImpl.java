package com.shier.shop.order.server.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.shier.shop.order.IBrandService;
import com.shier.shop.order.domian.Brand;
import com.shier.shop.order.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class BrandServiceImpl implements IBrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> getAllBrand() {
        return brandMapper.selectAll();
    }
}
