package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component()
public class RockMusic implements Music {

    @Value("Rock")
    private String name;
    @Value("23")
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
