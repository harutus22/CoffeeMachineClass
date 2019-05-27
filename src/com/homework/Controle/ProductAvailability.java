package com.homework.Controle;

import com.homework.MoneyControl.Balance;
import com.homework.MyExceptions.OutOfStock;
import com.homework.Products.Preparable;
import com.homework.Products.ReadyMadeProduct;

 class ProductAvailability {
    void available (ReadyMadeProduct product) throws OutOfStock {
        if(product.count == 0){
            throw new OutOfStock();
        }
        else{
            --product.count;
            Balance.minusBalance(product);
        }
    }
     void available(Preparable product){
        if((product.equals(Preparable.ESPRESSO)|| product.equals(Preparable.AMERICANO) ||
                product.equals(Preparable.BLACK_TEA) || product.equals(Preparable.MILK))){
            Prepare prepare = new Prepare();
            prepare.getProduct(product);
            prepare.start();
            System.out.print("Preparing");
            boolean k = true;
            while(k){
                System.out.print(".");
                try {
                    Prepare.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(!prepare.isAlive()){
                    k = false;
                }
            }
            Balance.minusBalance(product);
        }
    }
}
