package com.example.customlists;



public class Product {
    String name;
    int price;
    int image;
    boolean box;
    Product(String PrN, int Price, int Image, boolean cbox) {
        name = PrN;
        price = Price;
        image = Image;
        box = cbox;
    }
}