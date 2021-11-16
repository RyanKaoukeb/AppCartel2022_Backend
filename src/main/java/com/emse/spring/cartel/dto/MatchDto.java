package com.emse.spring.cartel.dto;
import com.emse.spring.cartel.model.Match;
import com.emse.spring.cartel.model.Sport;

public class MatchDto {
    //Attributes
    private Long id;
    private String date;
    private Long Score_1;
    private Long Score_2;
    private String team1;
    private String team2;
    private String sport;

    public MatchDto (){ //Basic Constructor
    }

    public MatchDto(Match match){ //Complete Constructor
        this.id= match.getId();
        this.date= match.getDate();
        this.Score_1= match.getScore_1();
        this.Score_2= match.getScore_2();
        this.team1=match.getTeam1();
        this.team2= match.getTeam2();
        this.sport= match.getSport();
    }
    //Getters
    public Long getId(){
        return id;
    }
    public String getDate(){
        return date;
    }
    public Long getScore_1(){return Score_1;}
    public Long getScore_2(){return Score_2;}
    public String getTeam1(){return team1;}
    public String getTeam2() {return team2;}
    public String getSport() { return sport;}

}
