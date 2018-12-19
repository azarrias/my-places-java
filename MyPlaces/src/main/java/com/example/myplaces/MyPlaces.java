package com.example.myplaces;

class MyPlaces {
    public static void main(String[] args) {
        Place place = new Place("Empire state building",
                "20 W 34th St, New York, NY 10001, EE. UU.",
                -73.9878531,
                40.7484405,
                TypePlace.EDUCATION,
                "+1 212-736-3100",
                "http://www.esbnyc.com/",
                "Beautiful view. Great historical building one of my favorites. Absolutely Love NYC!! Will return soon.",
                5
                );
        System.out.println("Place " + place.toString());
    }
}
