package com.digitalarchitect.microservices.product_service.dto;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public record ProductRequest(String id, String name, String description, BigDecimal price) {

}

