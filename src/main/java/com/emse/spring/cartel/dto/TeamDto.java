package com.emse.spring.cartel.dto;

import com.emse.spring.cartel.model.Team;

public class TeamDto {
    //Attributes
    private Long id;
    private String name;


    public TeamDto (){ //Basic Constructor
    }

    public TeamDto(Team team){ //Complete Constructor
        this.id= team.getId();
        this.name= team.getName();
    }

    //Getters
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}