package com.homework.Products;

public class ReadyMadeProduct {
    private int index;
    private String name;
    private int price;
    public int count;

    public ReadyMadeProduct(int price, String name, int index, int count) {
        this.price = price;
        this. name = name;
        this.index = index;
        this.count = count;
    }

    public void setProduct(int price, String name, int index, int count) {
        this.price = price;
        this. name = name;
        this.index = index;
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }
}


