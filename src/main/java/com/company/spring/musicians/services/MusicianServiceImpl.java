package com.company.spring.musicians.services;

import com.company.spring.musicians.domain.Musician;
import com.company.spring.musicians.repository.MusicianRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MusicianServiceImpl implements MusicianService {

    private final MusicianRepository musicianRepository;

    public MusicianServiceImpl(MusicianRepository musicianRepository) {
        this.musicianRepository = musicianRepository;
    }

    @Override
    public List<Musician> findAllMusicians() {
        return this.musicianRepository.findAll();
    }

    @Override
    public Musician findMusicianById(Long id) {
        return this.musicianRepository.findById(id).get();
    }

    @Override
    public Musician addMusician(Musician musician) {
        return this.musicianRepository.save(musician);
    }
}
