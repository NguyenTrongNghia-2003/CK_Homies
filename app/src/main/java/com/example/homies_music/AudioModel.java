package com.example.homies_music;

import java.io.Serializable;

public class AudioModel implements Serializable {
    String path;
    String title;
    String duration;

    //    đặt các thông tin như đuuongwf dẫn file, tên file,độ dài file
    public AudioModel(String path, String title, String duration) {
        this.path = path;
        this.title = title;
        this.duration = duration;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
