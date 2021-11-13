package com.emse.spring.cartel.model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "MATCH")
public class Match {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String date;

    @ManyToOne
    private Sport sport;

    @ManyToOne
    private Team team1;

    @ManyToOne
    private Team team2;

    private Long Score_1;
    private Long Score_2;

    public Long getId() {
        return id;
    }
    public String getDate() {
        return date;
    }




}
