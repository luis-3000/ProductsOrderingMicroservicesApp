package com.digitalarchitect.microservices.product_service.dto;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public record ProductRequest(String id, String name, String description, BigDecimal price) {

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }
}

