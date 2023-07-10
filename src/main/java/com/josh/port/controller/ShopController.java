package com.josh.port.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.josh.port.interfaces.ProductDaoInterface;

@Controller
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ProductDaoInterface productService;

    @GetMapping("/")
    public String getShopPage() {
        System.out.println(productService.getAllProducts().toString());
        return "shop";
    }
}