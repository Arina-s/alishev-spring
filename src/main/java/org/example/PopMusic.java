package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component("music")
public class PopMusic implements Music {

    private String name;
    private int duration;

    private PopMusic() {
    }

    public static PopMusic getPopMusic() {
        System.out.println("create with factory");
        return new PopMusic();
    }

    private void myInit() {
        System.out.println("-------INITIALIZATION---POP--------");
    }

    @Override
    public String getSong() {
        return this + "Pop music";
    }

}
