package com.pez.audio_player_application.pojo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @Source : lastfm/lastfm-android
 */

public class Album {
    private String artist;
    private String title;
    private String mbid;
    private String url;
    private ImageUrl[] images;


    public Album(String artist, String title, String mbid, String url, ImageUrl[] images) {
        this.artist = artist;
        this.title = title;
        this.mbid = mbid;
        this.url = url;
        this.images = images;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getMbid() {
        return mbid;
    }

    public String getUrl() {
        return url;
    }

    public ImageUrl[] getImages() {
        return images;
    }

    public String getURLforImageSize(String size) {
        for (ImageUrl image : images) {
            if (image.getSize().contentEquals(size)) {
                return image.getUrl();
            }
        }
        return null;
    }

}
