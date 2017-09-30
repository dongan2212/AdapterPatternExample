package com.patternexample;

/**
 * Created by Administrator on 9/30/2017.
 */
public class WMAPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMP4(String name) {

    }

    @Override
    public void playWMA(String name) {
        System.out.println("Plaing .wma file named" + name);
    }
}
