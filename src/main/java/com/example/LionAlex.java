package com.example;

import java.util.List;

public class LionAlex extends Lion {

    public LionAlex() throws Exception {
        super(new Feline(), "Самец");
    }

    @Override
    public int getKittens(){
        return 0;
    }

    @Override
    public List<String> getFood() {
        return List.of("Животные", "Птицы", "Рыба");
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
}
