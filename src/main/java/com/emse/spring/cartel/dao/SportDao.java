package com.emse.spring.cartel.dao;

import com.emse.spring.cartel.model.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Modifying;
import java.util.*;

public interface SportDao extends JpaRepository<Sport, String>{

    Sport getByName(String name);
    Sport getById(Long id);
}
