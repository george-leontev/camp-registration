package org.church.camp_registration.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "camp", schema = "business")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Camp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 32)
    private String name;

    @Column(name = "seats")
    private int seats;
    
    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @OneToMany(mappedBy = "camp", cascade = CascadeType.ALL)
    private List<Price> prices = new ArrayList<>();
}
