package com.alim.spring.gallery.entities;

import java.util.List;

public class Gallery {

    int id;
    List<Object> images;

    public Gallery(int id) {
        this.id = id;
    }

    public Gallery() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Object> getImages() {
        return images;
    }

    public void setImages(List<Object> images) {
        this.images = images;
    }
}
