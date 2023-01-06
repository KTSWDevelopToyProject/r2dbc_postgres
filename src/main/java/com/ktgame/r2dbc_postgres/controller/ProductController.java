package com.ktgame.r2dbc_postgres.controller;

import com.ktgame.r2dbc_postgres.domain.Product;
import com.ktgame.r2dbc_postgres.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("")
    Flux<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{productId}")
    Mono<Product> getProductById(@PathVariable Integer productId) {
        return productService.getProductById(productId);
    }

    @PostMapping("")
    Mono<Product> createProduct(@RequestBody Mono<Product> productMono) {
        return productMono.flatMap((product -> productService.createProduct(product)));
    }

}
