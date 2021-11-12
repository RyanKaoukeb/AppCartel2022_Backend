package com.emse.spring.cartel.model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "SPORT")
public class Sport {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "sport")
    private Set<Team> teams;

    public Sport() {
    }

    public Sport(String name) {
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