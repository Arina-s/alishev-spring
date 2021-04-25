package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private RockMusic rockMusic;
    private ClassicMusic classicMusic;
    private String number;

    @Autowired
    public MusicPlayer(RockMusic rockMusic, ClassicMusic classicMusic) {
        this.rockMusic = rockMusic;
        this.classicMusic = classicMusic;
    }

    public void playMusic() {
        System.out.println("Number: " + number);
        System.out.println("Playing music: " + rockMusic);
        System.out.println("Playing music: " + classicMusic);
    }

    private void myDestroy() {
        System.out.println("_______DESTROY________");
    }
}
