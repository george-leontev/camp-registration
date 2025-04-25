package org.church.camp_registration.repository;

import org.church.camp_registration.model.Notification;

import java.util.List;

public interface NotificationRepositoryCustom {
    List<Notification> getAll(String telegramId);
}
