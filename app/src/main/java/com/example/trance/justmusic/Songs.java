package com.example.trance.justmusic;

/**
 * Created by Trance on 6/21/2017.
 */

public class Songs {

    private long mSongID;
    private String mSongTitle;
    private String mSongArtist;
    private String mSongAlbum;
    private long mSongDuration;

    public Songs(long id, String title, String artist, String album, long duration){
        mSongID = id;
        mSongTitle = title;
        mSongArtist = artist;
        mSongAlbum = album;
        mSongDuration = duration;

    }

    @Override
    public String toString() {
        return this.getSongTitle() + "\n" + this.getSongArtist() + "\n" +
                this.getSongID() + "\n" + this.getSongAlbum() + "\n" + this.getSongDuration();
    }

    public long getSongID(){
        return mSongID;
    }

    public String getSongTitle(){
        return mSongTitle;
    }

    public String getSongArtist(){
        return mSongArtist;
    }
    public String getSongAlbum(){
        return mSongAlbum;
    }
    public long getSongDuration(){
        return mSongDuration;
    }

}

