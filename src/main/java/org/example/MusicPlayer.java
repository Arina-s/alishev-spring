package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MusicPlayer {

    private final Music music;

    public void playMusic() {
        System.out.println("Playing music: " + music.getSong());
    }

}
