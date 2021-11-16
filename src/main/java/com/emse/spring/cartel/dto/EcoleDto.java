package com.emse.spring.cartel.dto;
import com.emse.spring.cartel.model.Ecole;

public class EcoleDto {
    //Attributes
    private Long id;
    private String name;

    public EcoleDto (){ //Basic Constructor
    }

    public EcoleDto(Ecole ecole){ //Complete constructor
        this.id= ecole.getId();
        this.name= ecole.getName();
    }

    //Methods / Getters
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
