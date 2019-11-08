package com.company.spring.musicians.controllers;

import com.company.spring.musicians.domain.Musician;
import com.company.spring.musicians.services.MusicianService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(MusicianController.BASE_URL)
public class MusicianController {

    public static final String BASE_URL = "/api/v1/musicians";

    private final MusicianService musicianService;

    public MusicianController(MusicianService musicianService) {
        this.musicianService = musicianService;
    }

    @GetMapping
    public List<Musician> getAllMusicians(){
        return this.musicianService.findAllMusicians();
    }

    @GetMapping("/{id}")
    public Musician getMusicianById(@PathVariable Long id) {
        return this.musicianService.findMusicianById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Musician createMusician(@RequestBody Musician musician) {
        return this.musicianService.addMusician(musician);
    }
}
