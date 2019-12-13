package com.api.ecommerce.ecommerce.service;

import com.api.ecommerce.ecommerce.model.Image;
import com.api.ecommerce.ecommerce.repository.ImageRepository;
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
public class ImageServices {

    @Autowired
    ImageRepository imageRepository;

    /**
     * @return All the Image urls in the database
     */
    public List<Image> getAllImages() {
        return imageRepository.findAll();
    }

    /**
     * @param imageId
     * @return Image
     */
    public Image getImageById(Long imageId) {
        return imageRepository.getOne(imageId);
    }

    /**
     * Saves or updates an image Url
     *
     * @param image
     */
    public void saveOrUpdateImage(Image image) {
        imageRepository.save(image);
    }

    /**
     * Deletes the image url
     *
     * @param imageId
     */
    public void deleteImageById(Long imageId) {
        imageRepository.deleteById(imageId);
    }
}
