package com.example.planets;

public class ListItem {
    private String data;
    private int image;

    public ListItem(String data, int image) {
        this.data = data;
        this.image = image;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ListItem{" +
                "data='" + data + '\'' +
                ", image=" + image +
                '}';
    }
}
