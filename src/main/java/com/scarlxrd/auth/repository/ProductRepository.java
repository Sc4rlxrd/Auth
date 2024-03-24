package com.scarlxrd.auth.repository;

import com.scarlxrd.auth.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
}
