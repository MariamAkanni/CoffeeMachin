package org.formation.dto;

import jakarta.validation.constraints.Positive;

public record CoffeeUpdateDto(
        String name,
        @Positive(message = "Price should be positive")
        int price) {

}
