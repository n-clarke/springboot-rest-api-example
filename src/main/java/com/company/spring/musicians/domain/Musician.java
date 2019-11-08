package com.company.spring.musicians.domain;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Musician {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName, lastName, instrument;
    private String[] skills;
}
