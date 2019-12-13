package com.api.ecommerce.ecommerce.repository;

import com.api.ecommerce.ecommerce.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
}
