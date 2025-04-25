package org.church.camp_registration.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "notification", schema = "business")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 32)
    private String telegramId;

    @Column(length = 64)
    private String title;

    @Column(length = 64)
    private String content;

    @CreationTimestamp
    private LocalDateTime date;

    @Column(name = "is_read")
    private boolean isRead;

    @Column(name = "is_deleted")
    private boolean isDeleted;


    @Column(length = 32)
    private String icon;
}
