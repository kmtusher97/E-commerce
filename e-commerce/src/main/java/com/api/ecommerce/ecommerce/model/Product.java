package com.api.ecommerce.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "products")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productId")
    private Long id;

    @Column(nullable = false, length = 255)
    private String name;
    private String description;
    private Long quantity;
    private Double price;
    private Date uploadDate;

    @OneToMany(
            fetch = FetchType.LAZY,
            orphanRemoval = true,
            mappedBy = "product",
            cascade = CascadeType.ALL
    )
    private Set<Image> productImages = new HashSet<Image>();

    @OneToMany(
            fetch = FetchType.LAZY,
            orphanRemoval = true,
            mappedBy = "product",
            cascade = CascadeType.ALL
    )
    private Set<Video> productVideos = new HashSet<Video>();
}

