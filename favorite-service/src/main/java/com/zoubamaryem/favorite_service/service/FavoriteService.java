package com.zoubamaryem.favorite_service.service;

import com.zoubamaryem.favorite_service.model.Favorite;
import com.zoubamaryem.favorite_service.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteService {

    @Autowired
    private FavoriteRepository favoriteRepository;

    public List<Favorite> getFavorites(String userId) {
        return favoriteRepository.findByUserId(userId);
    }

    public Favorite addFavorite(Favorite favorite) {
        return favoriteRepository.save(favorite);
    }

    public void removeFavorite(String userId, String productId) {
        favoriteRepository.deleteByUserIdAndProductId(userId, productId);
    }
}
