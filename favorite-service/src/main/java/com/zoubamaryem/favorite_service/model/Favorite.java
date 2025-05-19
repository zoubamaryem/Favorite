package com.zoubamaryem.favorite_service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "favorites")
public class Favorite {

    @Id
    private String id;
    private String userId;
    private String productId;

    // Constructeurs
    public Favorite() {}

    public Favorite(String userId, String productId) {
        this.userId = userId;
        this.productId = productId;
    }

    // Getters et Setters
    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
