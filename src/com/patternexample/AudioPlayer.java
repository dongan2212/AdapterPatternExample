package com.patternexample;

/**
 * Created by Administrator on 9/30/2017.
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String name) {
        if (audioType.trim().equalsIgnoreCase(".mp3")) {
            System.out.println("Playing .mp3 file named " + name);
        } else if ((audioType.trim().equalsIgnoreCase(".mp4")) || (audioType.trim().equalsIgnoreCase(".wma"))) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, name);
        } else {
            System.out.println("Cannot play file " + name + " because of type " + audioType);
        }
    }
}
