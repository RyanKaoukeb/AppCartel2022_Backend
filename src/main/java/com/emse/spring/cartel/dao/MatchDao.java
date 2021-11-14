package com.emse.spring.cartel.dao;


import com.emse.spring.cartel.model.Match;
import com.emse.spring.cartel.model.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Modifying;
import java.util.*;

public interface MatchDao extends JpaRepository<Match, String>{
    Match getById(Long id);
    List<Match> getByDate(String date);
    List<Match> findBySportName(String name);
    List<Match> findByTeam1NameOrTeam2Name(String name1, String name2);
}
