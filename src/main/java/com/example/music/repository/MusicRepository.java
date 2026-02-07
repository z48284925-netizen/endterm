package com.example.music.repository;

import com.example.music.model.MusicContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<MusicContent, Long> {
}