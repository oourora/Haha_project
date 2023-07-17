package com.example.Haha.product.controller;

import com.example.Haha.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/Product")
public class ProductController {

    private final ProductService productService;

    public String list(Model model){
        Product product = this.productService.getList();
        model.attribute
    }



}
