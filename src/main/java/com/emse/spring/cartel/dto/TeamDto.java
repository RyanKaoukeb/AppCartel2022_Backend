package com.emse.spring.cartel.dto;

import com.emse.spring.cartel.model.Team;

public class TeamDto {
    private Long id;
    private String name;


    public TeamDto (){
    }

    public TeamDto(Team team){
        this.id= team.getId();
        this.name= team.getName();
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}