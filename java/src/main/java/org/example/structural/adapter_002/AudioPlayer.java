package org.example.structural.adapter_002;

import java.util.List;

public class AudioPlayer implements MediaPlayer {

    List<MediaFormat> supportedMediaFormats = List.of(
            MediaFormat.MP4, MediaFormat.VLC
    );

    MediaAdapter mediaAdapter = new MediaAdapter();

    @Override
    public void play(MediaFormat mediaFormat, String fileName) {
        //inbuilt support to play mp3 music files
        if (MediaFormat.MP3.equals(mediaFormat)) {
            System.out.println("Playing MP3 file. Name: " + fileName);
        }

        //mediaAdapter is providing support to play other file formats
        else if (isMediaFormatSupported(mediaFormat)) {
            mediaAdapter.play(mediaFormat, fileName);
        } else {
            System.out.println("Invalid media. " + mediaFormat + " format not supported");
        }
    }

    private boolean isMediaFormatSupported(MediaFormat mediaFormat) {
        return supportedMediaFormats.contains(mediaFormat);
    }
}
