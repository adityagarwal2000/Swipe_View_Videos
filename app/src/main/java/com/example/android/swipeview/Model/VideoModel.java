package com.example.android.swipeview.Model;

public class VideoModel {

    private String title, description, uploader, url;

    public VideoModel() {

    }

    public VideoModel(String title, String description, String uploader, String url) {
        this.title = title;
        this.description = description;
        this.uploader = uploader;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
