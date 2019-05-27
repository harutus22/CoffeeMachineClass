package com.homework.Controle;
import java.util.Scanner;

import com.homework.MoneyControl.*;
import com.homework.MyExceptions.*;


public class MachineController {

private static final String START_STRING = "Start";

    public static void control() {
        Scanner scan = new Scanner(System.in);
        CoinReader read = new CoinReader();
        Command command = new Command();
        String input = START_STRING;
        DisplayPrint.print("Hello,\nAdd some coin or choose what you want");
        while (!input.equals("Stop")) {
            DisplayPrint.print("Balance: " + Balance.getBalance());
            input = scan.nextLine();
            if (input.equals("Stop")) {
                return;
            }
            if (command.check(input)) {
                try {
                    command.getProduct(input);
                    continue;
                }
                catch (OutOfMoney a){
                    a.OutofCoins();
                    Balance.setBalance(0);
                    continue;
                }
                catch (OutOfStock o){
                    o.NoProduct();
                    Balance.setBalance(0);
                    continue;
                }
            }
            try {
                read.coincheck(Integer.parseInt(input));
            }
            catch (NumberFormatException o){
                DisplayPrint.print("There is no such button! \nPush the right button");
            }
            catch (NoCoin coin){
                coin.NoSuchCoin(Integer.parseInt(input));
            }
        }
    }
}
