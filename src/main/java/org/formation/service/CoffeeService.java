package org.formation.service;

import org.formation.dto.CoffeeCreateDto;
import org.formation.dto.CoffeeDto;
import org.formation.dto.CoffeeUpdateDto;
import org.formation.entity.Coffee;

import java.util.List;
import java.util.Optional;

public interface CoffeeService {

    List<CoffeeDto> allCoffees();
    Optional<CoffeeDto> oneCoffee(Long id);
    CoffeeDto create(CoffeeCreateDto coffeeDto);
    Optional<CoffeeDto> update(Long id, CoffeeUpdateDto dto);
    /// update


}
