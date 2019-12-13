package com.api.ecommerce.ecommerce.controller;

import com.api.ecommerce.ecommerce.model.Image;
import com.api.ecommerce.ecommerce.model.Product;
import com.api.ecommerce.ecommerce.service.ImageServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/image")
public class ImageController {

    @Autowired
    private ImageServices imageServices;

   /* @PostMapping("/add")
    public Image addImage(@RequestBody Product product) {

    }*/
}
