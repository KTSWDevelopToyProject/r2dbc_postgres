package com.ktgame.r2dbc_postgres.dto;

import com.ktgame.r2dbc_postgres.domain.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ReactiveCrudRepository<Product, Integer> {

}
