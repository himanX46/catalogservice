package com.himanbayan.productcatalog.services;

import com.himanbayan.productcatalog.models.Product;
import org.springframework.stereotype.Service;

@Service("selfProductServiceImpl")
public class SelfProductServiceImpl implements ProductService{
    @Override
    public String getProductById(Long id) {
        return ("SelfProductServiceImpl with id: "+id);
    }
}
