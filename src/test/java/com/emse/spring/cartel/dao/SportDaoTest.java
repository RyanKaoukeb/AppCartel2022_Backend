package com.emse.spring.cartel.dao;



import com.emse.spring.cartel.model.Sport;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class SportDaoTest {
    @Autowired
    private SportDao sportdao;

    @Test
    public void shouldFindId(){
        Sport sport = sportdao.getByName("FOOTBALL");
        Sport sport2= sportdao.getByName("RUGBY");

        Assertions.assertThat(sport.getId()).isEqualTo(1);
        Assertions.assertThat(sport2.getId()).isEqualTo(4);
    }

    @Test
    public void shouldFindName(){
        Sport sport=sportdao.getById(4L);
        Assertions.assertThat(sport.getName()).isEqualTo("RUGBY");

    }
}
