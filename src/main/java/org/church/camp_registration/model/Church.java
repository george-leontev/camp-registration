package org.church.camp_registration.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Table(name = "church", schema = "business")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Church {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 32, nullable = false)
    private String name;

    @OneToMany(mappedBy = "church", cascade = CascadeType.ALL)
    private List<Admin> admins = new ArrayList<>();
}
