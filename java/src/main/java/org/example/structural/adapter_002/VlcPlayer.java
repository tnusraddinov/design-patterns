package org.example.structural.adapter_002;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void play(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }
}
