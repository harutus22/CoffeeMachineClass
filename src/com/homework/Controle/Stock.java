package com.homework.Controle;

import com.homework.Products.Preparable;
import com.homework.Products.ReadyMadeProduct;


public class Stock {
    static int waterInLitrs = 800, coffeeInGrams = 200,tea = 300, sugarInGrams = 400, milk = 300, cup = 15;
    static ReadyMadeProduct twix = new ReadyMadeProduct(250, "Twix", 11, 10);
    static ReadyMadeProduct cocaCola = new ReadyMadeProduct(300,"CocaCola", 12, 5);
    static ReadyMadeProduct lays = new ReadyMadeProduct(600, "Lays", 13, 5);
    static Preparable americano = Preparable.AMERICANO;
    static Preparable espresso = Preparable.ESPRESSO;
    static Preparable teaProduct = Preparable.BLACK_TEA;
    static Preparable milkProduct = Preparable.MILK;

    static  {
        americano.setPriceIndex(250, 1);
        espresso.setPriceIndex(200, 2);
        teaProduct.setPriceIndex(250,3);
        milkProduct.setPriceIndex(150,4);
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setCoffeeInGrams(int coffeeInGrams) {
        this.coffeeInGrams += coffeeInGrams;
    }

    public void setSugarInGrams(int sugarInGrams) {
        this.sugarInGrams += sugarInGrams;
    }

    public void setTea(int tea) {
        this.tea = +tea;
    }

    public void setWaterInLitrs(int waterInLitrs) {
        this.waterInLitrs = +waterInLitrs;
    }

    public void setCup(int cup) {
        this.cup = +cup;
    }

    public int getCoffeeInGrams() {
        return coffeeInGrams;
    }

    public int getSugarInGrams() {
        return sugarInGrams;
    }

    public int getTea() {
        return tea;
    }

    public int getWaterInLitrs() {
        return waterInLitrs;
    }

    public int getCup() {
        return cup;
    }

    public static int getMilk() {
        return milk;
    }
}