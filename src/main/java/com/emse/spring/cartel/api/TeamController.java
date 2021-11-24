package com.emse.spring.cartel.api;


import com.emse.spring.cartel.dao.TeamDao;

import com.emse.spring.cartel.dto.TeamDto;

import com.emse.spring.cartel.model.Team;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
//declaration
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/team")
@Transactional
public class TeamController {
    private final TeamDao teamDao;

    public TeamController(TeamDao teamDao){
        this.teamDao=teamDao;
    } //Basic constructor

    @GetMapping
    //Function to return all Teams
    public List<TeamDto> findAll(){
        return teamDao.findAll().stream().map(TeamDto::new).collect(Collectors.toList());
    }

    @GetMapping (path="/{id}")
    //Function to return a team by its id
    public TeamDto findById(@PathVariable Long id) {
        Team team= teamDao.getById(id);
        return new TeamDto(team);
    }

    @GetMapping (path="/ecole/{name}")
    //Function to return all teams from a particular school
    public List<TeamDto> findByEcoleName(@PathVariable String name){
        return teamDao.findByEcoleName(name).stream().map(TeamDto::new).collect(Collectors.toList());
    }

    @GetMapping (path="/sport/{name}")
    //Function to return all teams from a particular sport
    public List<TeamDto> findBySportName(@PathVariable String name){
        return teamDao.findBySportName(name).stream().map(TeamDto::new).collect(Collectors.toList());
    }

}
