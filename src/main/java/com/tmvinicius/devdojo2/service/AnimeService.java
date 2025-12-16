package com.tmvinicius.devdojo2.service;

import com.tmvinicius.devdojo2.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {

    public List<Anime> listAll(){
        return List.of(new Anime(1L,"One Punch"), new Anime(2L,"DBZ"));
    }

}
