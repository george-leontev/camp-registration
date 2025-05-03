package org.church.camp_registration.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "payment_check", schema = "business")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class PaymentCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column()
    private byte[] data;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "registration_id")
    private Registration registration;
}
