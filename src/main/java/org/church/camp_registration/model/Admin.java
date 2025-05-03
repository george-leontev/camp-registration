package org.church.camp_registration.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "admin", schema = "business")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "bank_card_number", length = 64, nullable = false)
    private String bankCardNumber;

    @Column(name = "bank_card_owner", length = 64, nullable = false)
    private String bankCardOwner;

    @Column(name = "bank_name", length = 32, nullable = false)
    private String bankName;

    @Column(name = "phone_number", length = 32, nullable = false)
    private String phoneNumber;

    @Column(name = "for_bank_card", nullable = false)
    private Boolean forBankCard;

    @Column(name = "is_super_admin", nullable = false)
    private boolean isSuperAdmin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "church_id", nullable = false)
    private Church church;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}

