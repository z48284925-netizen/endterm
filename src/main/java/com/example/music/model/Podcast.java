package com.example.music.model;

public class Podcast extends MusicContent {
    private int episodeNumber;

    public Podcast(PodcastBuilder builder) {
        this.title = builder.title;
        this.artist = builder.artist;
        this.episodeNumber = builder.episodeNumber;
    }

    public static class PodcastBuilder {
        public String title;
        public String artist;
        public int episodeNumber;
        public PodcastBuilder setTitle(String title) { this.title = title; return this; }
        public PodcastBuilder setHost(String host) { this.artist = host; return this; }
        public PodcastBuilder setEpisode(int ep) { this.episodeNumber = ep; return this; }
        public Podcast build() { return new Podcast(this); }
    }
}