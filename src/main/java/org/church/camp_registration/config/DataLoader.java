package org.church.camp_registration.config;

import org.church.camp_registration.model.Church;
import org.church.camp_registration.repository.ChurchRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final ChurchRepository churchRepository;

    public DataLoader(ChurchRepository churchRepository) {
        this.churchRepository = churchRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (churchRepository.count() == 0) {
            var c1 = Church.builder()
                .name("New Life")
                .build();
            var c2 = Church.builder()
                .name("Word Of Truth")
                .build();
            churchRepository.saveAll(List.of(c1, c2));

            System.out.println("Database seeded successfully");
        }
    }
}