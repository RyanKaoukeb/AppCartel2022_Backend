package com.emse.spring.cartel.model;

import javax.persistence.*;

@Entity
@Table(name = "TEAM")
public class Team {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    private Ecole ecole;

    @ManyToOne
    private Sport sport;

    public Team() {
    }
}