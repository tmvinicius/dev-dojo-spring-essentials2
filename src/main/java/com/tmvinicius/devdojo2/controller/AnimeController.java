package com.tmvinicius.devdojo2.controller;
import com.tmvinicius.devdojo2.domain.Anime;
import com.tmvinicius.devdojo2.service.AnimeService;
import com.tmvinicius.devdojo2.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

    private final DateUtil dateU;
    private final AnimeService animeService;

    @GetMapping
    public List<Anime> list(){
        log.info(dateU.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return animeService.listAll();
    }

}
