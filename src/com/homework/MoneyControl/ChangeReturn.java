package com.homework.MoneyControl;
import java.util.Map;
import com.homework.Controle.*;

public class ChangeReturn {
    public int returningChange(Map coins, int balance){
        for(Coins money : Coins.values()){
            while(balance >= money.getValue()) {
                if (balance == 0) {
                    break;
                } else if ((int)coins.get(money.getValue()) > 0) {
                    DisplayPrint.print("Balance: " + balance + "\nReturning your " + money.getValue());
                    balance -= money.getValue();
                    Integer a = (Integer) coins.get(money.getValue());
                    coins.put(money.getValue(), --a);
                }
            }
        }
        DisplayPrint.print("Hello,\nAdd some coin or choose what you want");
        return balance;
    }
}
