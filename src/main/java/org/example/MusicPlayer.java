package org.example;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MusicPlayer {

    private List<Music> musicList;
    private String number;

    public void playMusic() {
        System.out.println("Number: " + number);
        musicList.forEach((music) -> System.out.println("Playing music: " + music));
    }

    private void myDestroy() {
        System.out.println("_______DESTROY________");
    }
}
