package com.test.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "points")
@Getter
@Setter
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer x;
    private Integer y;

}
