package org.church.camp_registration.repository.camps;

import org.church.camp_registration.model.Camp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.Instant;
import java.util.List;

public interface CampRepository extends JpaRepository<Camp, Integer> {
    @Query("""
                    select l.price.camp.id from Registration r
                    inner join RegistrationLinkPrice l on l.registration.id = r.id
                    where r.lastName = :#{#lastName} and r.birthdate = :#{#birthdate}
                    and r.isActive = true and r.registrationStatus.id != 4
            """)
    List<Integer> getByLastName(@Param("lastName") String lastName, @Param("birthdate") Instant birthdate);
}
