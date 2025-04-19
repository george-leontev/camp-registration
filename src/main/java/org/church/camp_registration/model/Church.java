package org.church.camp_registration.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "church")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Church {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 32)
    private String name;
}
