package org.church.camp_registration.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "user", schema = "business")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column()
    private String phone;

    @Column(name = "photo_url")
    private String photoUrl;

    @Column(name = "telegram_id", unique = true)
    private String telegramId;
}
