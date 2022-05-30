package org.example.structural.adapter_002;

public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;

    @Override
    public void play(MediaFormat audioType, String fileName) {
        //inbuilt support to play mp3 music files
        if(audioType.equals(MediaFormat.MP3)){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }

        //mediaAdapter is providing support to play other file formats
        else if(audioType.equals(MediaFormat.VLC) || audioType.equals(MediaFormat.MP4)){
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(audioType, fileName);
        }

        else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
