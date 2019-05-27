package com.homework.MyExceptions;

import com.homework.MoneyControl.Balance;
import com.homework.MoneyControl.ChangeReturn;
import com.homework.MoneyControl.CoinCollector;

public class OutOfMoney extends IllegalArgumentException {
    private ChangeReturn change = new ChangeReturn();
    public OutOfMoney() {
    }

    public void OutofCoins(){
        System.out.println("Not enough money!!!");
        change.returningChange(CoinCollector.getMap(), Balance.getBalance());
    }

}
