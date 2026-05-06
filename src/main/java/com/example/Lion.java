package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private IFeline ifeline;

    public Lion(IFeline ifeline){
        this.ifeline = ifeline;
    }

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return ifeline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return ifeline.getFood("Хищник");
    }
}
