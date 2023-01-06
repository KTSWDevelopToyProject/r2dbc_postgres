package com.ktgame.r2dbc_postgres.service;

import com.ktgame.r2dbc_postgres.domain.Product;
import com.ktgame.r2dbc_postgres.dto.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public Flux<Product> getAllProducts() {
        return repository.findAll();
    }

    public Mono<Product> getProductById(Integer productId) {
        return repository.findById(productId);
    }

    public Mono<Product> createProduct(Product product) {
        return repository.save(product);
    }

}
