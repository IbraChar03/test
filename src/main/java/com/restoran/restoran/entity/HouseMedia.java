package com.restoran.restoran.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "house_media")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HouseMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "file_url")
    private String fileUrl;
    @Enumerated(EnumType.STRING)
    private HouseMediaTypeEnum type;
    @ManyToOne
    @JoinColumn(name = "house_id", nullable = false)
    private House house;
}
