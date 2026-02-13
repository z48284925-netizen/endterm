package com.example.music.patterns;

import com.example.music.model.MusicContent;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class MusicCache {
    private static MusicCache instance;

    private final Map<String, List<MusicContent>> cache = new ConcurrentHashMap<>();

    private MusicCache() {}

    public static synchronized MusicCache getInstance() {
        if (instance == null) {
            instance = new MusicCache();
        }
        return instance;
    }

    public List<MusicContent> get(String key) {
        try {
            System.out.println("Trying to get from cache for key: " + key);
            return cache.get(key);
        } catch (Exception e) {
            System.err.println("Error reading from cache: " + e.getMessage());
            return null;
        }
    }

    public void put(String key, List<MusicContent> data) {
        cache.put(key, data);
    }


    public void clear() {
        cache.clear();
        System.out.println("DEBUG: Cache cleared! Data has been invalidated.");
    }
}