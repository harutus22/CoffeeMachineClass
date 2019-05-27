package com.homework.MoneyControl;
import com.homework.MyExceptions.NoCoin;

public class CoinReader {

    public void coincheck(final int coin) throws NoCoin {
        for(Coins coins : Coins.values())
        {
            if(coin == coins.getValue()){
                Balance.addBalance(coin);
                return;
            }
        }
        throw new NoCoin();
    }
}
