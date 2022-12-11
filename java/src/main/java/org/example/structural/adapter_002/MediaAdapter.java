package org.example.structural.adapter_002;

import java.util.HashMap;
import java.util.Map;

public class MediaAdapter implements MediaPlayer {

    Map<MediaFormat, AdvancedMediaPlayer> advancedMediaPlayerMap = new HashMap<>(
            Map.ofEntries(
                Map.entry(MediaFormat.VLC, new VlcPlayer()),
                Map.entry(MediaFormat.MP4, new Mp4Player()) // add more AdvancedMediaPlayer implementations
            )
    );

    @Override
    public void play(MediaFormat mediaFormat, String fileName) {
        AdvancedMediaPlayer advancedMediaPlayer = advancedMediaPlayerMap.getOrDefault(mediaFormat,
                new UnsupportedFormatPlayer());
        advancedMediaPlayer.play(fileName);
    }
}
