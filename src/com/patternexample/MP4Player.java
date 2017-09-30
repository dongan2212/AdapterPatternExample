package com.patternexample;

/**
 * Created by Administrator on 9/30/2017.
 */
public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playMP4(String name) {
        System.out.println("Playing .mp4 file named" + name);
    }

    @Override
    public void playWMA(String name) {

    }
}
