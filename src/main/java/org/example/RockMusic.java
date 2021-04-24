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

    @Override
    public String getSong() {
        return this + "Rock music";
    }

}
