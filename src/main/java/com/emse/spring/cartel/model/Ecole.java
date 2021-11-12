package com.emse.spring.cartel.model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "ECOLE")
public class Ecole {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "ecole")
    private Set<Team> teams;

    public Ecole(){
    }

    public Ecole(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
