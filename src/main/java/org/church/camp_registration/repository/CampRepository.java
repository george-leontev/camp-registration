package org.church.camp_registration.repository;

import org.church.camp_registration.model.Camp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampRepository extends JpaRepository<Camp, Integer> {
    
}
