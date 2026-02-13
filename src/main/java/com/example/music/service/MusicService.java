package com.example.music.service;

import com.example.music.model.MusicContent;
import com.example.music.repository.MusicRepository;
import com.example.music.patterns.MediaFactory;
import com.example.music.patterns.MusicCache;
import com.example.music.dto.MusicRequest;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MusicService {
    private final MusicRepository repository;
    private final MusicCache cache = MusicCache.getInstance();

    public MusicService(MusicRepository repository) {
        this.repository = repository;
    }

    public List<MusicContent> findAll() {
        String key = "all_music_list";
        List<MusicContent> cachedData = cache.get(key);

        if (cachedData != null) {
            System.out.println("Returning cached data...");
            return cachedData;
        }


        System.out.println("Querying database...");
        List<MusicContent> result = repository.findAll();

        cache.put(key, result);

        return result;
    }

    public MusicContent save(MusicRequest req) {
        MusicContent music = MediaFactory.create(req.getType(), req.getTitle());
        MusicContent saved = repository.save(music);
        cache.clear();

        return saved;
    }
}