package com.zoubamaryem.favorite_service.controller;

import com.zoubamaryem.favorite_service.model.Favorite;
import com.zoubamaryem.favorite_service.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/favorites")
@CrossOrigin(origins = "*") // autorise toutes les origines (pour Frontend)
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;

    // ✅ GET - Récupérer les favoris d’un utilisateur
    @GetMapping("/{userId}")
    public List<Favorite> getFavoritesByUser(@PathVariable String userId) {
        return favoriteService.getFavorites(userId);
    }

    // ✅ POST - Ajouter un produit aux favoris
    @PostMapping
    public Favorite addFavorite(@RequestBody Favorite favorite) {
        return favoriteService.addFavorite(favorite);
    }

    // ✅ DELETE - Supprimer un produit des favoris
    @DeleteMapping("/{userId}/{productId}")
    public void removeFavorite(@PathVariable String userId, @PathVariable String productId) {
        favoriteService.removeFavorite(userId, productId);
    }
}
