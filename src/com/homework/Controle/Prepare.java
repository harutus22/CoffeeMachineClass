package com.homework.Controle;
import com.homework.MyExceptions.OutOfStock;
import com.homework.Products.Preparable;

 class Prepare extends Thread {

      private Preparable product;

     @Override
     public void run() {
         super.run();
         prepare(product);
     }


     void getProduct(Preparable product){
         this.product = product;
     }

     private void prepare(Preparable preparable) throws OutOfStock {
        if (preparable.getWater() >= Stock.waterInLitrs || preparable.getCup() >= Stock.cup) {
            throw new OutOfStock();
        }

         switch (preparable) {
                case BLACK_TEA:
                    if (preparable.getMainIngridient() >= Stock.tea) {
                        throw new OutOfStock();
                    }
                    Stock.waterInLitrs -= preparable.getWater();
                    Stock.tea -= preparable.getMainIngridient();
                    Stock.cup -= preparable.getCup();
                    break;
                case ESPRESSO:
                    if (preparable.getMainIngridient() >= Stock.coffeeInGrams) {
                        throw new OutOfStock();
                    }
                    Stock.waterInLitrs -= preparable.getWater();
                    Stock.coffeeInGrams -= preparable.getMainIngridient();
                    Stock.cup -= preparable.getCup();
                    break;
                case AMERICANO:
                    if (preparable.getMainIngridient() >= Stock.coffeeInGrams) {
                        throw new OutOfStock();
                    }
                    Stock.waterInLitrs -= preparable.getWater();
                    Stock.coffeeInGrams -= preparable.getMainIngridient();
                    Stock.cup -= preparable.getCup();
                    break;
                case MILK:
                    if (preparable.getMainIngridient() > Stock.milk) {
                        throw new OutOfStock();
                    }
                    Stock.waterInLitrs -= preparable.getWater();
                    Stock.milk -= preparable.getMainIngridient();
                    Stock.cup -= preparable.getCup();
                    break;
            }
         try {
             Prepare.sleep(5000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
    }
}
