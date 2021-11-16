package com.emse.spring.cartel.dao;


import com.emse.spring.cartel.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface MatchDao extends JpaRepository<Match, String>{
    Match getById(Long id);
    List<Match> getByDate(String date);
    List<Match> findBySportName(String name);
    List<Match> findByTeam1NameOrTeam2Name(String name1, String name2); //This function can search all matches from a particular team
}
