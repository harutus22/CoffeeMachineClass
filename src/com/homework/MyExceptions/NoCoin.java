package com.homework.MyExceptions;

public class NoCoin extends IllegalArgumentException {
    public NoCoin() {
    }

    public void NoSuchCoin(int number) {
        System.out.println("There is no such coin as " + number + " !!!");
    }
}
