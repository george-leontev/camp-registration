package org.church.camp_registration.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "faq", schema = "business")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Faq {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 256, nullable = false)
    private String question;

    @Column(length = 256, nullable = false)
    private String answer;
}
