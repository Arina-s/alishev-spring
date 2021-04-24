package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class ClassicMusic implements Music {

    private List<String> name;
    private int duration;

    private void myInit() {
        System.out.println("-------INITIALIZATION---CLASSICAL--------");
    }

    @Override
    public String getSong() {
        return this + "Classic music";
    }

}
