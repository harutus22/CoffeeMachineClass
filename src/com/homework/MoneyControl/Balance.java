package com.homework.MoneyControl;
import com.homework.Controle.DisplayPrint;
import com.homework.MyExceptions.OutOfMoney;
import com.homework.Products.Preparable;
import com.homework.Products.ReadyMadeProduct;

public class Balance {
    static int balance = 0;

    public static int getBalance() {
        return balance;
    }

     static void addBalance(int coin){
        balance += coin;
        CoinCollector.addCoin(coin);
    }
    public static void minusBalance(ReadyMadeProduct product) throws OutOfMoney
    {
        if(balance - product.getPrice() >= 0) {
            balance -= product.getPrice();
            DisplayPrint.print("Take your " + product.getName());
        } else {
            throw new OutOfMoney();
        }
        balance = CoinCollector.changeReturn();
    }
    public static void minusBalance(Preparable product){
        if(balance - product.getPrice() >= 0){
            balance -= product.getPrice();
            DisplayPrint.print("\nTake your " + product.name());
        } else {
            throw new OutOfMoney();
        }
        balance = CoinCollector.changeReturn();
    }

    public static void setBalance(int balance) {
        Balance.balance = balance;
    }
}
