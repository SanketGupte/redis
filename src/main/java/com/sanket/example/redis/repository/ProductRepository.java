package com.sanket.example.redis.repository;

import com.sanket.example.redis.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
