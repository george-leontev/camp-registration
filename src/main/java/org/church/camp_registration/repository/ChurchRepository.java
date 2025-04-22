package org.church.camp_registration.repository;

import org.church.camp_registration.model.Church;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChurchRepository extends JpaRepository<Church, Integer> {
    
}
