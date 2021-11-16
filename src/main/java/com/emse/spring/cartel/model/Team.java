package com.emse.spring.cartel.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "TEAM")
public class Team {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id; //Primary Key

    private String name;

    @ManyToOne
    private Ecole ecole; //Foreign Key

    @ManyToOne
    private Sport sport; //Foreign Key

    @OneToMany(mappedBy = "team1")
    private Set<Match> matches1; //Foreign Key

    @OneToMany(mappedBy = "team2")
    private Set<Match> matches2; //Foreign Key
    //Constructor
    public Team() {
    }
    //Getters
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }


}