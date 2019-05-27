package com.homework.Products;

public enum Preparable{
    ESPRESSO(){
        int coffee = 20, water = 50, cup = 1;

        public int getCup() { return cup; }
        public int getWater() { return water; }
        public int getMainIngridient() { return coffee; }
    }, AMERICANO()
            {
                int coffee = 20, water = 100, cup = 1;

                public int getCup() { return cup; }
                public int getWater() { return water; }
                public int getMainIngridient() { return coffee; }
            }, BLACK_TEA(){
        int tea = 20, water = 100, cup = 1;

        public int getCup() { return cup; }
        public int getWater() { return water; }
        public int getMainIngridient() { return tea; }
    }, MILK(){
        int milk = 100, cup = 1, water = 0;
        public int getCup() { return cup; }
        public int getMainIngridient() { return milk; }
        public int getWater() { return water; }
    };
    int index, price, cup, mainIngridient, water;

    public void setPriceIndex(int price, int index) {
        this.price = price;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public double getPrice() {
        return price;
    }

    public int getCup() { return cup; }

    public int getMainIngridient() { return mainIngridient; }

    public int getWater() { return water; }
}
