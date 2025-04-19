package org.church.camp_registration.controller;

import java.util.List;

import org.church.camp_registration.exception.ResourceNotFoundException;
import org.church.camp_registration.model.Camp;
import org.church.camp_registration.repository.CampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/camps")
public class CampController {
    @Autowired()
    private CampRepository campRepository;

    @GetMapping()
    public List<Camp> getAll() {
        var camps = campRepository.findAll();

        return camps;
    }

    @GetMapping("/{id}")
    public Camp get(int id) {
        var camp = campRepository
            .findById(id)
            .orElseThrow(
                    () -> new ResourceNotFoundException("The camp was not found.")
            );

        return camp;
    }
}
