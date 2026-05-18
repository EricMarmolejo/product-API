package com.integracionContinua.productapi.repository;

import com.integracionContinua.productapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}