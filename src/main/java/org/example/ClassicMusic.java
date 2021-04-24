package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClassicMusic implements Music {

    private List<String> name;
    private int duration;

    @Override
    public String getSong() {
        return this + "Classic music";
    }

}
