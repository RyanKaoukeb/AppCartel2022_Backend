package com.emse.spring.cartel.model;

import javax.persistence.*;
import java.util.Set;

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

    @OneToMany(mappedBy = "team1")
    private Set<Match> matches1;

    @OneToMany(mappedBy = "team2")
    private Set<Match> matches2;

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public Team() {
    }
}