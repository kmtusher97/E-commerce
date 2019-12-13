package com.api.ecommerce.ecommerce.service;

import com.api.ecommerce.ecommerce.model.Video;
import com.api.ecommerce.ecommerce.repository.VideoRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Service
@Transactional
public class VideoServices {

    @Autowired
    private VideoRepository videoRepository;

    /**
     * @return All Video urls
     */
    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    /**
     * @param videoId
     * @return Video
     */
    public Video getVideoById(Long videoId) {
        return videoRepository.getOne(videoId);
    }

    /**
     * Saves or updates a video url
     *
     * @param video
     */
    public void saveOrUpdateVideo(Video video) {
        videoRepository.save(video);
    }

    /**
     * Deletes the video url
     *
     * @param videoId
     */
    public void deleteVideoById(Long videoId) {
        videoRepository.deleteById(videoId);
    }
}
