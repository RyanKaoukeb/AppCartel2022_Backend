package com.emse.spring.cartel.dto;

import com.emse.spring.cartel.model.Sport;

public class SportDto {
    //Attributes
    private Long id;
    private String name;

    public SportDto (){ //Basic Constructor
    }

    public SportDto(Sport sport){ //Complete Constructor
        this.id= sport.getId();
        this.name= sport.getName();
    }

    //Getters
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
