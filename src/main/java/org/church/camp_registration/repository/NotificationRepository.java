package org.church.camp_registration.repository;

import org.church.camp_registration.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
    @Query("""
                    from Notification as n
                    where n.telegramId = :telegramId and  n.isDeleted = false
            """)
    List<Notification> getAll(@Param("telegramId") String telegramId);
}
