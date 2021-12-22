package com.emse.spring.cartel.model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "MATCH")
public class Match {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id; //Primary Key

    private String date;

    @ManyToOne
    private Sport sport; //Foreign Key

    @ManyToOne
    private Team team1; //Foreign Key

    @ManyToOne
    private Team team2;  //Foreign Key

    private Long Score_1;
    private Long Score_2;

    //Constructors
    public Match(Long id,String date,Sport sport,Team team1,Team team2, Long Score_1,Long Score_2){
        this.id=id;
        this.date=date;
        this.sport=sport;
        this.team1=team1;
        this.team2=team2;
        this.Score_2=Score_2;
        this.Score_1=Score_1;
    }

    public Match(){

    }

    public String getDate() {
        return date;
    }
    //Getters/Setters
    public Long getId() {
        return id;
    }
    public Long getScore_1(){return Score_1;}
    public Long getScore_2(){return Score_2;}
    public String getTeam1(){
        return team1.getName();
    }
    public String getTeam2(){
        return team2.getName();
    }
    public String getSport() { return sport.getName(); }
    public void setScore( Long score1,Long score2){
        this.Score_1=score1;
        this.Score_2=score2;
    }
    public void setDate(String date){
        this.date=date;
    }




}
