package ru.sevastopall.practice_jooq.domain;

import lombok.Data;

@Data
public class City {

    private Long id;
    private Long countryId;
    private String name;
}
