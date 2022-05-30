package org.example.structural.adapter_002;

public class AdapterDemoMain {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play(MediaFormat.MP3, "beyond the horizon.mp3");
        audioPlayer.play(MediaFormat.MP4, "alone.mp4");
        audioPlayer.play(MediaFormat.VLC, "far far away.vlc");
        audioPlayer.play(MediaFormat.AVI, "mind me.avi");
    }
}
