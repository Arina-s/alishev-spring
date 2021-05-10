package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;


@Component
@Scope("singleton")
public class MusicPlayer {

    private List<Music> musicList;

    @Autowired
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("INITIALIZATION");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("DESTROY");
    }

    public void playMusic() {
        musicList.forEach(music -> System.out.println(music.getSong()));
    }

}
