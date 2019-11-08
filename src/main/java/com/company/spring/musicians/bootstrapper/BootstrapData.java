package com.company.spring.musicians.bootstrapper;

import com.company.spring.musicians.domain.Musician;
import com.company.spring.musicians.repository.MusicianRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final MusicianRepository musicianRepository;

    public BootstrapData(MusicianRepository musicianRepository) {
        this.musicianRepository = musicianRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading Musician Data");

        //Creating some musicians
        Musician m1  = new Musician();
        m1.setFirstName("John");
        m1.setLastName("Smith");
        m1.setInstrument("Guitar");
        m1.setSkills(new String[] {"Singing", "Song Writer"});
        musicianRepository.save(m1);

        Musician m2  = new Musician();
        m2.setFirstName("Sarah");
        m2.setLastName("Wilson");
        m2.setInstrument("Drums");
        musicianRepository.save(m2);

        System.out.println("Finishing Loading Musicians");
    }
}
