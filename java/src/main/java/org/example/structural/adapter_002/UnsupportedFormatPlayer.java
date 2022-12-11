package org.example.structural.adapter_002;

public class UnsupportedFormatPlayer implements AdvancedMediaPlayer {

    @Override
    public void play(String fileName) {
        System.out.println("Unsupported format file: " + fileName);
    }
}
