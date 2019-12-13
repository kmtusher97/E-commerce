package com.api.ecommerce.ecommerce.repository;

import com.api.ecommerce.ecommerce.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {
}
