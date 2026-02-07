package com.example.music.patterns;

import com.example.music.model.*;

public class MediaFactory {
    public static MusicContent create(String type, String title) {
        if (type.equalsIgnoreCase("SONG")) {
            return new Song.SongBuilder().setTitle(title).build();
        } else if (type.equalsIgnoreCase("PODCAST")) {
            return new Podcast.PodcastBuilder().setTitle(title).build();
        }
        throw new IllegalArgumentException();
    }
}