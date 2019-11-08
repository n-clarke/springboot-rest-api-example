package com.company.spring.musicians.repository;

import com.company.spring.musicians.domain.Musician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicianRepository extends JpaRepository<Musician, Long> {


}
