package com.tmvinicius.devdojo2.service;

import com.tmvinicius.devdojo2.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class AnimeService {

    private List<Anime> animes = List.of(new Anime(1L,"One Punch"), new Anime(2L,"DBZ"));

    public List<Anime> listAll(){
        return animes;
    }

    public Optional<Anime> findById(long id){
        return Optional.of(animes.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Anime não encontrado")));
    }

}
