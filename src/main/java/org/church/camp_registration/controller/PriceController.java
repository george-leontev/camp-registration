package org.church.camp_registration.controller;

import org.church.camp_registration.exception.ResourceNotFoundException;
import org.church.camp_registration.model.Price;
import org.church.camp_registration.repository.PriceRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/prices")
public class PriceController {
    private final PriceRepository priceRepository;

    public PriceController(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @GetMapping()
    public List<Price> getAll()
    {
        var prices = this.priceRepository.findAll();

        return prices;
    }

    @GetMapping("/{id}")
    public Price get(@PathVariable int id)
    {
        var price = this.priceRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Price was not found"));

        return price;
    }
}
