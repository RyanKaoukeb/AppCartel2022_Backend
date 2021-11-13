package com.emse.spring.cartel.dao;
import java.util.*;


import com.emse.spring.cartel.model.Match;
import com.emse.spring.cartel.model.Team;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class MatchDaoTest {
    @Autowired
    private MatchDao matchdao;

    @Test
    public void shouldFindId(){
        Match match = matchdao.getByDate("21/04/22 10:30");
        Assertions.assertThat(match.getId()).isEqualTo(2);
    }

    @Test
    public void shouldFindMatch(){
        List<Match> matches=matchdao.findByTeam1NameOrTeam2Name("MORSE","MORSE");
        Assertions.assertThat(matches.get(0).getDate()).isEqualTo("21/04/22 10:00");
    }
}
