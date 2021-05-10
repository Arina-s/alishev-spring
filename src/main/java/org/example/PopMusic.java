package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music {

    @Value("${popMusic.name}")
    private String name;

    @Value("${popMusic.value}")
    private int value;
    private String[] songs = new String[]{"El Problem", "Cadillac", "Knee Socks"};

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
