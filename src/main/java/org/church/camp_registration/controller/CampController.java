package org.church.camp_registration.controller;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

import org.church.camp_registration.exception.ResourceNotFoundException;
import org.church.camp_registration.model.Camp;
import org.church.camp_registration.repository.camps.CampRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.format.annotation.DateTimeFormat;

@RestController()
@RequestMapping("/api/camps")
public class CampController {
    private final CampRepository campRepository;

    public CampController(CampRepository campRepository) {
        this.campRepository = campRepository;
    }

    @GetMapping()
    public List<Camp> getAll() {
        var camps = campRepository.findAll();

        return camps;
    }

    @GetMapping("/{id}")
    public Camp get(@PathVariable int id) {
        var camp = campRepository
                .findById(id)
                .orElseThrow(
                        () -> new ResourceNotFoundException("The camp was not found."));

        return camp;
    }

    @GetMapping("/{lastName}/{birthdate}")
    public List<Integer> getByLastName(@PathVariable String lastName, @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Instant birthdate) {
        var campIds = campRepository.getByLastName(lastName, birthdate);

        return campIds;
    }
}
