package com.homework.MoneyControl;

import java.util.HashMap;
import java.util.Map;

public class CoinCollector {

    static private Map map = new HashMap<Coins, Integer>();

    static {
        map.put(Coins.C50.getValue(), 10);
        map.put(Coins.C100.getValue(), 10);
        map.put(Coins.C200.getValue(), 10);
        map.put(Coins.C500.getValue(), 10);
    }

    public static Map getMap() {
        return map;
    }

    static void addCoin(int coin) {
        for (Coins coins : Coins.values()) {
            if (coin == coins.getValue()) {
                Integer a = (Integer) map.get(coin);
                map.put(coin, ++a);
                break;
            }
        }
    }
    static int changeReturn(){
        return new ChangeReturn().returningChange(map, Balance.balance);
    }
}
