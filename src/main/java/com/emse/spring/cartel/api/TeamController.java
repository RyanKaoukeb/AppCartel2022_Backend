package com.emse.spring.cartel.api;


import com.emse.spring.cartel.dao.TeamDao;

import com.emse.spring.cartel.dto.TeamDto;

import com.emse.spring.cartel.model.Team;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/team")
@Transactional
public class TeamController {
    private final TeamDao teamDao;

    public TeamController(TeamDao teamDao){
        this.teamDao=teamDao;
    }

    @GetMapping
    public List<TeamDto> findAll(){
        return teamDao.findAll().stream().map(TeamDto::new).collect(Collectors.toList());
    }

    @GetMapping (path="/{id}")
    public TeamDto findById(@PathVariable Long id) {
        Team team= teamDao.getById(id);
        return new TeamDto(team);
    }

    @GetMapping (path="/ecole/{name}")
    public List<TeamDto> findByEcoleName(@PathVariable String name){
        return teamDao.findByEcoleName(name).stream().map(TeamDto::new).collect(Collectors.toList());
    }

    @GetMapping (path="/sport/{name}")
    public List<TeamDto> findBySportName(@PathVariable String name){
        return teamDao.findBySportName(name).stream().map(TeamDto::new).collect(Collectors.toList());
    }

}
