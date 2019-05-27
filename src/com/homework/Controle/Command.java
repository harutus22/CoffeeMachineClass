package com.homework.Controle;

import com.homework.Products.Preparable;
import com.homework.Products.ReadyMadeProduct;

import java.util.HashMap;
import java.util.Map;

public class Command {

    private static Map command = new HashMap();
    private ProductAvailability availability = new ProductAvailability();

     static {
         command.put("A1", Stock.twix);
         command.put("A2", Stock.cocaCola);
         command.put("B1", Stock.lays);
         command.put("B2", Stock.americano);
         command.put("C1", Stock.espresso);
         command.put("C2", Stock.teaProduct);
         command.put("D1", Stock.milkProduct);
    }
     boolean check(String key){
         if(command.containsKey(key)){
             return true;
         }
         return false;
    }

    void getProduct(String key){

          if(command.get(key).getClass().equals(ReadyMadeProduct.class)){
              availability.available((ReadyMadeProduct)(command.get(key)));
          }
          else if(command.get(key).getClass().equals(Preparable.AMERICANO.getClass()) ||
                  command.get(key).getClass().equals(Preparable.ESPRESSO.getClass()) ||
                  command.get(key).getClass().equals(Preparable.BLACK_TEA.getClass()) ||
                  command.get(key).getClass().equals(Preparable.MILK.getClass())){
              availability.available((Preparable)(command.get(key)));
          }
    }
}
