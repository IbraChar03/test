package com.restoran.restoran.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "carousels")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarouselArticle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imageUrl;
    @ManyToOne
    @JoinColumn(name = "article_id", nullable = false)
    private Article article;
}
