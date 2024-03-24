package com.scarlxrd.auth.domain.product;

public record ProductResponseDTO(String name, String id, Integer price) {
    public ProductResponseDTO(Product product){
        this(product.getId(), product.getName(), product.getPrice());
    }
}
