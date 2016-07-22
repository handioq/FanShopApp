package com.github.handioq.fanshop.model.dbo;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class ProductDBO extends RealmObject {

    @PrimaryKey
    private Integer id;

    private String name;
    private Double price;
    private String imageUrl;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
