package org.church.camp_registration.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.church.camp_registration.model.Notification;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NotificationRepositoryImpl implements NotificationRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Notification> getAll(String telegramId) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Notification> query = cb.createQuery(Notification.class);
        Root<Notification> notification = query.from(Notification.class);

        query.where(
                        cb.and(
                                cb.equal(notification.get("isDeleted"), false),
                                cb.equal(notification.get("telegramId"), telegramId)
                        ))
                .orderBy(cb.asc(notification.get("isRead")), cb.desc(notification.get("date")));

        return entityManager.createQuery(query).getResultList();
    }
}
