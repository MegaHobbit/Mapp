package com.example.mapp.Service;

import com.example.mapp.Models.Products;
import com.example.mapp.Repositories.ProductRepository;
import com.example.mapp.dto.ProductRequest;
import com.example.mapp.dto.ProductResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Getter
@Setter
public class ProductService {

    private final ProductRepository productRepository;


    public void createProduct(ProductRequest productRequest) {

         Products product = Products.builder()
                 .name(productRequest.getName())
                 .description(productRequest.getDescription())
                 .buyingPrice(productRequest.getBuyingPrice())
                 .sellingPrice(productRequest.getSellingPrice())
                 .quantity(productRequest.getQuantity())
                 .build();

         productRepository.save(product);
         log.info( "product {} is saved",  product.getId() );
         log.info( "Successfully created product {}",  product.getId() );


    }

    public List<ProductResponse> getAllProducts() {

        List<Products> products = productRepository.findAll();

        return products.stream().map(this::mapToProductResponse).toList();
    }


    private ProductResponse mapToProductResponse(Products product) {

        return ProductResponse.builder()

                .name(product.getName())
                .description(product.getDescription())
                .buyingPrice(product.getBuyingPrice())
                .sellingPrice(product.getSellingPrice())
                .quantity(product.getQuantity())
                .build();
    }


    public void createProducts(List<ProductRequest> products) {

        List<Products> productList = products.stream()
                .map(p -> Products.builder()
                        .name(p.getName())
                        .description(p.getDescription())
                        .quantity(p.getQuantity())
                        .buyingPrice(p.getBuyingPrice())
                        .sellingPrice(p.getSellingPrice())
                        .build()
                )
                .toList();

        productRepository.saveAll(productList);
    }
}
