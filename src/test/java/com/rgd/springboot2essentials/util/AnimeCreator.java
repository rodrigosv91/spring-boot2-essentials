package com.rgd.springboot2essentials.util;

import com.rgd.springboot2essentials.domain.Anime;

public class AnimeCreator {
    public static Anime createAnimeToBeSaved() {
        return Anime.builder()
                .name("Tensei Shitara Slime Datta Ken")
                .build();
    }

    public static Anime createValidAnime() {
        return Anime.builder()
                .name("Tensei Shitara Slime Datta Ken")
                .id(1)
                .build();
    }

    public static Anime createValidUpdatedAnime() {
        return Anime.builder()
                .name("Tensei Shitara Slime Datta Ken 2")
                .id(1)
                .build();
    }
}
