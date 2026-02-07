package com.example.music.model;

public class Song extends MusicContent {
    private String album;

    public Song(SongBuilder builder) {
        this.title = builder.title;
        this.artist = builder.artist;
        this.album = builder.album;
    }

    public static class SongBuilder {
        public String title;
        public String artist;
        public String album;
        public SongBuilder setTitle(String title) { this.title = title; return this; }
        public SongBuilder setArtist(String artist) { this.artist = artist; return this; }
        public SongBuilder setAlbum(String album) { this.album = album; return this; }
        public Song build() { return new Song(this); }
    }
}