package com.restoran.restoran.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "users_packages")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "package_id", nullable = false)
    private Package userPackage;
    private LocalDateTime activationDate;
    @Column(name = "expiration_date")
    private LocalDateTime expirationDate;

}

