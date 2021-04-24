package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = (MusicPlayer) context.getBean("musicPlayer");
        System.out.println(musicPlayer1 == musicPlayer2);
        System.out.println(musicPlayer1.hashCode());
        System.out.println(musicPlayer2.hashCode());
        musicPlayer1.setNumber("444444");
        System.out.println("------changed value-------");
        System.out.println(musicPlayer1 == musicPlayer2);
        System.out.println(musicPlayer1);
        System.out.println(musicPlayer2);
        musicPlayer1.playMusic();
        musicPlayer2.playMusic();
        context.close();
    }

}
