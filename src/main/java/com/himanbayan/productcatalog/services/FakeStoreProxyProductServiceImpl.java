package com.himanbayan.productcatalog.services;

import com.himanbayan.productcatalog.dtos.FakeStoreProductDto;
import com.himanbayan.productcatalog.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("fakeStoreProxyProductServiceImpl")
public class FakeStoreProxyProductServiceImpl implements ProductService{

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    private String requestUrl = "https://fakestoreapi.com/products/{id}";

    /*public void FakeStoreProxyProductServiceImpl(RestTemplateBuilder restTemplateBuilder){
        this.restTemplateBuilder = restTemplateBuilder;
    }*/

    @Override
    public String getProductById(Long id) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> response =  restTemplate.getForEntity(requestUrl, FakeStoreProductDto.class,id);
        //response.getStatusCode()
        return ("fakeStoreProxyProductServiceImpl with id: "+id);
    }
}
