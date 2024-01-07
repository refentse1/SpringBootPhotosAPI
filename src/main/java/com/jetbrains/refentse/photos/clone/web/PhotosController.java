package com.jetbrains.refentse.photos.clone.web;

import com.jetbrains.refentse.photos.clone.model.Photo;
import com.jetbrains.refentse.photos.clone.service.PhotosService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.Collection;

@RestController

public class PhotosController {


    private final PhotosService photosService;

    public PhotosController(PhotosService photosService) {
        this.photosService = photosService;
    }

    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/photos")
    public Iterable<Photo> getPhotos(){
        return this.photosService.get();
    }

    @GetMapping("/photos/{id}")
    public Photo getPhoto(@PathVariable Integer id){
        Photo photo = photosService.get(id);
        if(photo == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return photo;
    }

    @DeleteMapping("/photos/{id}")
    public void deletePhoto(@PathVariable Integer id){
        photosService.remove(id);
    }

    @PostMapping("/photos")
    public Photo addPhoto(@RequestPart("data") MultipartFile file) throws IOException {
       return photosService.save(file.getOriginalFilename(),file.getContentType(),file.getBytes());
    }



}
 