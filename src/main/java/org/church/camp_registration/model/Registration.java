package org.church.camp_registration.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "registration", schema = "business")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 32, nullable = false)
    private String name;

    @Column(length = 32, name = "last_name", nullable = false)
    private String lastName;

    @Column(nullable = false)
    private Instant birthdate;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "registration_date", nullable = false)
    private Instant registrationDate;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @Column(length = 16, nullable = false)
    private String phone;

    @Column(name = "is_medical_worker", nullable = false)
    private boolean isMedicalWorker;

    @Column(name = "is_organizer", nullable = false)
    private boolean isOrganizer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "church_id", nullable = false)
    private Church church;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "registration_status_id", nullable = false)
    private RegistrationStatus registrationStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_type_id")
    private PaymentType paymentType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admin_id", nullable = false)
    private Admin admin;
}
