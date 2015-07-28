package com.test.structural_patterns.patternadapter;

/**
 * Created by nhakor on 27-07-15.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name : " + fileName);
    }
}
