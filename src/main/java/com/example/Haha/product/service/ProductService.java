package com.example.Haha.product.service;

import com.example.Haha.product.entity.ProductEntity;
import com.example.Haha.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public list<Product> getList{
        List<Product> productList = this.productRepository.findAll();
        return productList.get();
    }
}
