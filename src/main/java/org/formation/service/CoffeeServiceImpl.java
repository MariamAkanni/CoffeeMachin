package org.formation.service;

import jakarta.annotation.PostConstruct;
import lombok.Setter;
import org.formation.entity.Coffee;
import org.formation.repository.CoffeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoffeeServiceImpl implements CoffeeService {

    private CoffeeRepository repository;

    public CoffeeServiceImpl(CoffeeRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    void initDb(){
        repository.saveAll(List.of(
                new Coffee("Expresso", 2),
                new Coffee("Cappuccino", 3),
                new Coffee("Latte", 4)
        ));

    }

    @Override
    public List<Coffee> allCoffees() {
        return repository.findAll();
    }

    @Override
    public Optional<Coffee> getCoffee(Long id) {
        return Optional.empty();
    }
}
