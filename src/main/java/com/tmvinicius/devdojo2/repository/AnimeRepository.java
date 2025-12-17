package com.tmvinicius.devdojo2.repository;

import com.tmvinicius.devdojo2.domain.Anime;

import java.util.List;

public interface AnimeRepository {

    List<Anime> listAll();
    Anime findById();
}
