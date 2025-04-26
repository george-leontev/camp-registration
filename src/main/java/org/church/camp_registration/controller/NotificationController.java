package org.church.camp_registration.controller;

import org.church.camp_registration.model.Notification;
import org.church.camp_registration.repository.notifications.NotificationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {
    private final NotificationRepository notificationRepository;

    public NotificationController(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @GetMapping("/{telegramId}")
    public List<Notification> getAll(@PathVariable String telegramId) {
        var notifications = this.notificationRepository.getAll(telegramId);

        return notifications;
    }

    @GetMapping("/read/{id}")
    public Notification updateIsRead(@PathVariable Integer id) {
        var updatedNotification = this.notificationRepository.updateIsRead(id);

        return updatedNotification;
    }

    @GetMapping("/delete/{id}")
    public Notification updateIsDeleted(@PathVariable Integer id) {
        var deletedNotification = this.notificationRepository.updateIsDeletedAsync(id);

        return deletedNotification;
    }
}
