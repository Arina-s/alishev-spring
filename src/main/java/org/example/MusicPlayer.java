package org.example;

import lombok.Data;
import java.util.List;

@Data
public class MusicPlayer {

    private List<Music> musicList;
    private String number;

    public void playMusic() {
        System.out.println("Number: " + number);
        musicList.forEach((music) -> System.out.println("Playing music: " + music));
    }

}
