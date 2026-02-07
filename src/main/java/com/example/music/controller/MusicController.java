package com.example.music.controller;

import com.example.music.model.MusicContent;
import com.example.music.service.MusicService;
import com.example.music.dto.MusicRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/music")
public class MusicController {
    private final MusicService service;

    public MusicController(MusicService service) {
        this.service = service;
    }

    @GetMapping
    public List<MusicContent> getAll() { return service.findAll(); }

    @PostMapping
    public ResponseEntity<MusicContent> create(@RequestBody MusicRequest req) {
        return ResponseEntity.ok(service.save(req));
    }
}