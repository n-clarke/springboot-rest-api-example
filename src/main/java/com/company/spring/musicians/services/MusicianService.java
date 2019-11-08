package com.company.spring.musicians.services;

import com.company.spring.musicians.domain.Musician;

import java.util.List;

public interface MusicianService {

    List<Musician> findAllMusicians();

    Musician findMusicianById(Long id);

    Musician addMusician(Musician musician);

}
