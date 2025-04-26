package org.church.camp_registration.repository.notifications;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.church.camp_registration.exception.ResourceNotFoundException;
import org.church.camp_registration.model.Notification;
import org.springframework.stereotype.Repository;

@Repository
public class NotificationCustomRepositoryImpl implements NotificationCustomRepository {
    @PersistenceContext
    private final EntityManager entityManager;

    public NotificationCustomRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public Notification updateIsRead(Integer id) throws ResourceNotFoundException {
        var notification = entityManager.find(Notification.class, id);

        if (notification == null) {
            throw new ResourceNotFoundException("Notification was not found");
        }
        notification.setRead(true);

        return entityManager.merge(notification);
    }

    @Override
    @Transactional
    public Notification updateIsDeletedAsync(Integer id) throws ResourceNotFoundException {
        var notification = entityManager.find(Notification.class, id);

        if (notification == null) {
            throw new ResourceNotFoundException("Notification was not found");
        }

        notification.setDeleted(true);

        return entityManager.merge(notification);
    }
}
