package com.emse.spring.cartel.dto;
import com.emse.spring.cartel.model.Ecole;

public class EcoleDto {
    private Long id;
    private String name;

    public EcoleDto (){
    }

    public EcoleDto(Ecole ecole){
        this.id= ecole.getId();
        this.name= ecole.getName();
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
