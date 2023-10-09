package com.rgd.springboot2essentials.util;

import com.rgd.springboot2essentials.domain.Anime;
import com.rgd.springboot2essentials.exception.ResourceNotFoundException;
import com.rgd.springboot2essentials.repository.AnimeRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class Utils {

    public String formatLocalDateTimeToDatabaseStyle(LocalDateTime localDateTime) {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(localDateTime);
    }

    public Anime findAnimeOrThrowNotFound(int id, AnimeRepository animeRepository) {
        return animeRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Anime Not Found"));
    }
}
