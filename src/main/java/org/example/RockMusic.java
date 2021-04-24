package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RockMusic implements Music {

    private String name;
    private int duration;

    private void myInit() {
        System.out.println("-------INITIALIZATION---ROCK--------");
    }

    private void myDestroy() {
        System.out.println("-------DESTROY---ROCK--------");
    }

    @Override
    public String getSong() {
        return this + "Rock music";
    }

}
