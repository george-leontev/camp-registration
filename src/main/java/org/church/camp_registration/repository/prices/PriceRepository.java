package org.church.camp_registration.repository.prices;

import org.church.camp_registration.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Integer> {
}
