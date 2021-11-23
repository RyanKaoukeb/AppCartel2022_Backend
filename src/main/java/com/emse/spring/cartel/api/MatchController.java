package com.emse.spring.cartel.api;
import com.emse.spring.cartel.dao.MatchDao;
import com.emse.spring.cartel.dto.MatchDto;
import com.emse.spring.cartel.model.Match;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/match")
@Transactional
public class MatchController {
    private final MatchDao matchDao;

    public MatchController(MatchDao matchDao){
        this.matchDao=matchDao;
    } // Basic constructor

    @GetMapping
    //Function to return all matches
    public List<MatchDto> findAll(){
        return matchDao.findAll().stream().map(MatchDto::new).sorted(Comparator.comparing(MatchDto::getDate)).collect(Collectors.toList());
    }

    @GetMapping (path="/{id}")
    //Function to return a match by its id
    public MatchDto findById(@PathVariable Long id) {
        Match match= matchDao.getById(id);
        return new MatchDto(match);
    }

    @GetMapping(path="/sport/{name}")
    //Function to return all matches of a same sport
    public List<MatchDto> findBySport(@PathVariable String name) {
        return matchDao.findBySportName(name).stream().map(MatchDto::new).sorted(Comparator.comparing(MatchDto::getDate)).collect(Collectors.toList());
    }

    @GetMapping(path="/ecole/{name}")
    //Function to return all matches played by the same school
    public List<MatchDto> findBySchool(@PathVariable String name) {
        return matchDao.findByTeam1NameOrTeam2Name(name,name).stream().map(MatchDto::new).sorted(Comparator.comparing(MatchDto::getDate)).collect(Collectors.toList());
    }
}
