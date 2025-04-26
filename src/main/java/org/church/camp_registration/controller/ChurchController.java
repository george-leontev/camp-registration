package org.church.camp_registration.controller;

import java.util.List;

import org.church.camp_registration.exception.ResourceNotFoundException;
import org.church.camp_registration.model.Church;
import org.church.camp_registration.repository.churches.ChurchRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/churches")
public class ChurchController {
    private final ChurchRepository churchRepository;

    public ChurchController(ChurchRepository churchRepository) {
        this.churchRepository = churchRepository;
    }

    @GetMapping()
    public List<Church> getAll() {
        var churches = churchRepository.findAll();

        return churches;
    }

    @GetMapping("/{id}")
    public Church get(@PathVariable int id) {
        var church = churchRepository
                .findById(id)
                .orElseThrow(
                        () -> new ResourceNotFoundException("The camp was not found."));

        return church;
    }
}
