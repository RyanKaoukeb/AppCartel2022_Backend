package com.emse.spring.cartel.dao;


import com.emse.spring.cartel.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface TeamDao extends JpaRepository<Team, String>{
    Team getByName(String name);
    Team getById(Long id);
    List<Team> findBySportName(String name);
    List<Team> findByEcoleName(String name);
}