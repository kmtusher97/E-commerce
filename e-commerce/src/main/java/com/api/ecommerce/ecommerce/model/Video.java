package com.api.ecommerce.ecommerce.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "videos")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "videoId")
    private Long id;

    @Column(name = "videoUrl", nullable = false)
    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
}
