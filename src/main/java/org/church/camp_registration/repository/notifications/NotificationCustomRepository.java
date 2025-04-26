package org.church.camp_registration.repository.notifications;

import org.church.camp_registration.exception.ResourceNotFoundException;
import org.church.camp_registration.model.Notification;

public interface NotificationCustomRepository {
    Notification updateIsRead(Integer id) throws ResourceNotFoundException;

    Notification updateIsDeletedAsync(Integer id) throws ResourceNotFoundException;
}
