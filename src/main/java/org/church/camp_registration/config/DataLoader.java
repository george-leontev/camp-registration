package org.church.camp_registration.config;

import org.church.camp_registration.repository.churches.ChurchRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final ChurchRepository churchRepository;

    public DataLoader(ChurchRepository churchRepository) {
        this.churchRepository = churchRepository;
    }

    @Override
    public void run(String... args) {
        if (churchRepository.count() == 0) {
            System.out.println("DataLoader executed successfully");
        }
    }
}