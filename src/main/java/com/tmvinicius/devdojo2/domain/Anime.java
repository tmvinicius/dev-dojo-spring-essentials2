package com.tmvinicius.devdojo2.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Anime {

    private Long id;
    @JsonProperty("name")
    private String name;

}
