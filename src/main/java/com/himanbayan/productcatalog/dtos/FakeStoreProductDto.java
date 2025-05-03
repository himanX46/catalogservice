package com.himanbayan.productcatalog.dtos;

import lombok.Setter;

@Setter
public class FakeStoreProductDto {
    private Long id;
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;
}
