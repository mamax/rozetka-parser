package com.parser.rozetka.categories;

public class Product {

    private int price;
    private int name;

    public Product(int price, int name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }


}
