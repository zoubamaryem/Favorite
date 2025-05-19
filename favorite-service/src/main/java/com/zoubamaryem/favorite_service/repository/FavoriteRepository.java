package com.zoubamaryem.favorite_service.repository;

import com.zoubamaryem.favorite_service.model.Favorite;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FavoriteRepository extends MongoRepository<Favorite, String> {
    List<Favorite> findByUserId(String userId);
    void deleteByUserIdAndProductId(String userId, String productId);
}
