package com.patternexample;

/**
 * Created by Administrator on 9/30/2017.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.trim().equalsIgnoreCase(".mp4")) {
            advancedMediaPlayer = new MP4Player();
        } else if (audioType.trim().equalsIgnoreCase(".wma")) {
            advancedMediaPlayer = new WMAPlayer();
        }
    }

    @Override
    public void play(String audioType, String name) {
        if (audioType.trim().equalsIgnoreCase(".mp4")) {
            advancedMediaPlayer.playMP4(name);
        } else if (audioType.trim().equalsIgnoreCase(".wma")) {
            advancedMediaPlayer.playWMA(name);
        }
    }
}
