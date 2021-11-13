package com.emse.spring.cartel.dao;
import java.util.*;


import com.emse.spring.cartel.model.Team;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class TeamDaoTest {
    @Autowired
    private TeamDao teamdao;

    @Test
    public void shouldFindId(){
        Team team = teamdao.getByName("MORSE");
        Assertions.assertThat(team.getId()).isEqualTo(2);
    }

    @Test
    public void shouldFindName(){
        Team team=teamdao.getById(3L);
        Assertions.assertThat(team.getName()).isEqualTo("LIONS");

    }

    @Test
    public void shouldFindSchool(){
        List<Team> teams=teamdao.findByEcoleName("EMSE");
        Assertions.assertThat(teams.get(0).getName()).isEqualTo("MASSE");
        Assertions.assertThat(teams.get(1).getName()).isEqualTo("MORSE");//à arranger avec des listes
    }

    @Test
    public void shouldFindSport(){
        List<Team> teams=teamdao.findBySportName("FOOTBALL");
        Assertions.assertThat(teams.get(0).getName()).isEqualTo("MASSE"); //à arranger avec des listes
    }
}