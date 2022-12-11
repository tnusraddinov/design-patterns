package org.example.structural.adapter_002;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void play(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }
}
