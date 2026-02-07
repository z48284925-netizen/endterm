package com.example.music.service;

import com.example.music.model.MusicContent;
import com.example.music.repository.MusicRepository;
import com.example.music.patterns.MediaFactory;
import com.example.music.dto.MusicRequest;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MusicService {
    private final MusicRepository repository;

    public MusicService(MusicRepository repository) {
        this.repository = repository;
    }

    public List<MusicContent> findAll() { return repository.findAll(); }

    public MusicContent save(MusicRequest req) {
        MusicContent music = MediaFactory.create(req.getType(), req.getTitle());
        return repository.save(music);
    }
}