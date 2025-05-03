package com.himanbayan.productcatalog.controllers;

import com.himanbayan.productcatalog.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products/")
public class ProductController {

    @Autowired
    @Qualifier("fakeStoreProxyProductServiceImpl")
    private ProductService productService;

    /*public void ProductService(@Qualifier("fakeStoreProxyProductServiceImpl") ProductService productService){
        this.productService = productService;
    }*/

    @GetMapping
    public void getAllProducts(){

    }

    @GetMapping("{id}")
    public String getProductById(@PathVariable("id") Long id){
        return productService.getProductById(id);

    }

    @DeleteMapping("{id}")
    public void deleteProductById(@PathVariable("id") Long id){

    }

    @PostMapping
    public void createProduct(){

    }

    @PutMapping("{id}")
    public void updateProductById(@PathVariable("id") Long id){

    }
}
