package com.api.ecommerce.ecommerce.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "images")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "imageId")
    private Long id;

    @Column(name = "imageUrl", nullable = false)
    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
}
