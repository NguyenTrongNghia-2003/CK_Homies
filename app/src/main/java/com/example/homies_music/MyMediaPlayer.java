package com.example.homies_music;

import android.media.MediaPlayer;
//phát nhạc từ file mp3 trong bộ nhớ
public class MyMediaPlayer {
    static MediaPlayer instance;

    public static MediaPlayer getInstance(){
        if(instance == null){
            instance = new MediaPlayer();
        }
        return instance;
    }

    public static int currentIndex = -1;
}
