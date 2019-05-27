package com.homework.MyExceptions;

import com.homework.MoneyControl.Balance;
import com.homework.MoneyControl.ChangeReturn;
import com.homework.MoneyControl.CoinCollector;

public class OutOfStock extends IllegalArgumentException {

    private ChangeReturn change = new ChangeReturn();

    public OutOfStock() {
    }

    public void NoProduct(){
        System.out.println("Out of Stock!!!");
        change.returningChange(CoinCollector.getMap(),Balance.getBalance());
    }


}
