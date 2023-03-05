package com.example.planets;

import java.io.Serializable;
import java.util.ArrayList;

public class Planet implements Serializable {
    private String name;
    private int image;
    private String[] curiosities;

    public Planet(String name, int image, String[] curiosities) {
        this.name = name;
        this.image = image;
        this.curiosities = curiosities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String[] getCuriosities() {
        return curiosities;
    }

    public void setCuriosities(String[] curiosities) {
        this.curiosities = curiosities;
    }

    @Override
    public String toString() {
        return "{" + "name = '" + name + "', " + "image = " + image + "}";
    }
}
