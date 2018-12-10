package com.example.myplaces;

public class Place {
    private String name;
    private String address;
    private GeoCoord position;
    private String photo;
    private String phone;
    private String url;
    private String comment;
    private long date;
    private float rating;

    public Place(String name, String address, double longitude, double latitude, String phone,
                 String url, String comment, int rating) {
        date = System.currentTimeMillis(); // Unix time
        position = new GeoCoord(longitude, latitude);
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.url = url;
        this.comment = comment;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GeoCoord getPosition() {
        return position;
    }

    public void setPosition(GeoCoord position) {
        this.position = position;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Place{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", position=" + position +
                ", photo='" + photo + '\'' +
                ", phone=" + phone +
                ", url='" + url + '\'' +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                ", rating=" + rating +
                '}';
    }
}
