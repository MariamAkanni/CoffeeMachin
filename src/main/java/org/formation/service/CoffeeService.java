package org.formation.service;

import org.formation.entity.Coffee;

import java.util.List;
import java.util.Optional;

public interface CoffeeService {

    List<Coffee> allCoffees();
    Optional<Coffee> getCoffee(Long id);
}
