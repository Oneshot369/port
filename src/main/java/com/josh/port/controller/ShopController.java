package com.josh.port.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.josh.port.interfaces.ProductBusinessInterface;

@Controller
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ProductBusinessInterface productService;

    @GetMapping("/")
    public String getShopPage(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "shop";
    }
}