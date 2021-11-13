package com.emse.spring.cartel.dao;
import com.emse.spring.cartel.model.Ecole;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@DataJpaTest
public class EcoleDaoTest {
    @Autowired
    private EcoleDao ecoledao;

    @Test
    public void shouldFindId(){
        Ecole ecole = ecoledao.getByName("EMSE");
        Ecole ecole2= ecoledao.getByName("ALBI");

        Assertions.assertThat(ecole.getId()).isEqualTo(1);
        Assertions.assertThat(ecole2.getId()).isEqualTo(2);
    }

    @Test
    public void shouldFindName(){
        Ecole ecole=ecoledao.getById(1L);
        Assertions.assertThat(ecole.getName()).isEqualTo("EMSE");

    }
}
