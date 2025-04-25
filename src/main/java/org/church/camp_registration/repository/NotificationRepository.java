package org.church.camp_registration.repository;

import org.church.camp_registration.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Integer>, NotificationRepositoryCustom {

}
