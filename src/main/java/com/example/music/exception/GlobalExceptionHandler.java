package com.example.music.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handle(Exception e) {
        return ResponseEntity.internalServerError().body(Map.of("message", e.getMessage()));
    }
}