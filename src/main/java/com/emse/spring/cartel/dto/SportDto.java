package com.emse.spring.cartel.dto;

import com.emse.spring.cartel.model.Sport;

public class SportDto {
    private Long id;
    private String name;

    public SportDto (){
    }

    public SportDto(Sport sport){
        this.id= sport.getId();
        this.name= sport.getName();
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
