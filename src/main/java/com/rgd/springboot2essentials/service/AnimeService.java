package com.rgd.springboot2essentials.service;

import com.rgd.springboot2essentials.domain.Anime;
import com.rgd.springboot2essentials.repository.AnimeRepository;
import com.rgd.springboot2essentials.util.Utils;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AnimeService {
    private final Utils utils;
    private final AnimeRepository animeRepository;

    public Page<Anime> listAll(Pageable pageable) {
        return animeRepository.findAll(pageable);
    }

    public List<Anime> findByName(String name) {
        return animeRepository.findByName(name);
    }

    public Anime findById(int id) {
        return utils.findAnimeOrThrowNotFound(id, animeRepository);
    }

    @Transactional
    public Anime save(Anime anime){
        return animeRepository.save(anime);
    }

    public void delete(int id) {
        animeRepository.delete(utils.findAnimeOrThrowNotFound(id, animeRepository));
    }

    public void update(Anime anime) {
        animeRepository.save(anime);
    }
}
