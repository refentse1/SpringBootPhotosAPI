package com.jetbrains.refentse.photos.clone.repository;

import com.jetbrains.refentse.photos.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotosRepository extends CrudRepository<Photo,Integer> {

}
