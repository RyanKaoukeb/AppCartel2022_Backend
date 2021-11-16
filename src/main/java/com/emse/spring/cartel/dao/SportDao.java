package com.emse.spring.cartel.dao;

import com.emse.spring.cartel.model.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface SportDao extends JpaRepository<Sport, String>{
    Sport getByName(String name);
    Sport getById(Long id);
    List<Sport> findAll();
}
