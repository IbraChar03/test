package com.restoran.restoran.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "houses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    private String address;
    private String city;
    private String region;
    private Integer rooms;
    private Integer bedrooms;
    private Integer kitchens;
    private Integer bathrooms;
    private Integer floor;
    @Enumerated(EnumType.STRING)
    @Column(name = "energy_rating")
    private EnergyRatingEnum energyRating;
    @OneToMany(mappedBy = "house", cascade = CascadeType.ALL)
    private List<HouseMedia> media = new ArrayList<>();

}
