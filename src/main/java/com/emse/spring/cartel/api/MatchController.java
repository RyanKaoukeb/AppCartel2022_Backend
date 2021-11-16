package com.emse.spring.cartel.api;
import com.emse.spring.cartel.dao.MatchDao;
import com.emse.spring.cartel.dto.MatchDto;
import com.emse.spring.cartel.model.Match;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/match")
@Transactional
public class MatchController {
    private final MatchDao matchDao;

    public MatchController(MatchDao matchDao){
        this.matchDao=matchDao;
    }

    @GetMapping
    public List<MatchDto> findAll(){
        return matchDao.findAll().stream().map(MatchDto::new).sorted(Comparator.comparing(MatchDto::getDate)).collect(Collectors.toList());
    }

    @GetMapping (path="/{id}")
    public MatchDto findById(@PathVariable Long id) {
        Match match= matchDao.getById(id);
        return new MatchDto(match);
    }

    @GetMapping(path="/sport/{name}")
    public List<MatchDto> findBySport(@PathVariable String name) {
        return matchDao.findBySportName(name).stream().map(MatchDto::new).sorted(Comparator.comparing(MatchDto::getDate)).collect(Collectors.toList());
    }

    @GetMapping(path="/ecole/{name}")
    public List<MatchDto> findBySchool(@PathVariable String name) {
        return matchDao.findByTeam1NameOrTeam2Name(name,name).stream().map(MatchDto::new).sorted(Comparator.comparing(MatchDto::getDate)).collect(Collectors.toList());
    }
}
