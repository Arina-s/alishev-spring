package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    @Value("Rock Music")
    private String name;

    private String[] songs = new String[]{"La La La Rock", "Rock and Rol", "Brazers"};

    @Override
    public String getSong() {
        int index = (int) (Math.random() * 3);
        return "Genre: " + name + " " + songs[index];
    }

}
