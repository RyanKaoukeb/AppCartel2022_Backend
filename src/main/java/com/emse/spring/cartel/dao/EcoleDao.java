package com.emse.spring.cartel.dao;

import com.emse.spring.cartel.model.Ecole;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;


public interface EcoleDao extends JpaRepository<Ecole, String> {
    Ecole getByName(String name);
    Ecole getById(Long id);
    List<Ecole> findAll();
}