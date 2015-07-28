package com.test.structural_patterns.patternadapter;

/**
 * Created by nhakor on 27-07-15.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.print("Playing vlc file. Name : " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
