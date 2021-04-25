package org.example;

import org.springframework.stereotype.Component;

import java.util.List;

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

    @Override
    public String toString() {
        return "ClassicMusic{" +
                "name=" + name +
                ", duration=" + duration +
                '}';
    }

}
