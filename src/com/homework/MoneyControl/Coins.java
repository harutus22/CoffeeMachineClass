package com.homework.MoneyControl;

enum  Coins {
    C500(500), C200(200), C100(100), C50(50);
    private int value;

    Coins(int value){
        this.value = value;
    }

    int getValue(){
        return value;
    }
}
