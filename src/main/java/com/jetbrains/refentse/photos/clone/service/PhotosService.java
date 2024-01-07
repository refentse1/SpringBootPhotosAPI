package com.jetbrains.refentse.photos.clone.service;

import com.jetbrains.refentse.photos.clone.model.Photo;
import com.jetbrains.refentse.photos.clone.repository.PhotosRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;

//@Component
@Service
public class PhotosService {


    private final PhotosRepository photosRepository;

    public PhotosService(PhotosRepository photosRepository) {
        this.photosRepository = photosRepository;
    }

    public Iterable<Photo> get() {
        return photosRepository.findAll();
    }

    public Photo get(Integer id) {
        return photosRepository.findById(id).orElse(null);
    }

    public void remove(Integer id) {
        photosRepository.deleteById(id);
    }

    public void put(String id, Photo photo) {
    }

    public Photo save(String fileName, String contentType, byte[] data) {
        Photo photo = new Photo();
        photo.setFileName(fileName);
        photo.setData(data);
        photo.setContentType(contentType);
        photosRepository.save(photo);
        return photo;
    }
}
