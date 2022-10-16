package com.example.homework2_11.Controller;

import com.example.homework2_11.Basket.Product;
import com.example.homework2_11.Service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/add")
    public Product addProduct(@RequestParam("add") int productID ) {
        return productService.add(productID);
    }
    @GetMapping("/get")
    public List<Product> getProduct() {
        return productService.get();
    }

}
