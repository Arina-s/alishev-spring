package org.example;

import org.springframework.beans.factory.annotation.Value;

public class ClassicMusic implements Music {

    @Value("${classicMusic.name}")
    private String name;

    @Value("${classicMusic.value}")
    private int value;
    private String[] songs = new String[]{"Bethoven", "Bax", "Mozart"};

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String getSong() {
        int index = (int) (Math.random() * 3);
        return "Genre: " + name + " " + songs[index];
    }

}
