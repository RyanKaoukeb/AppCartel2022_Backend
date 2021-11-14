package com.emse.spring.cartel.api;
import com.emse.spring.cartel.dao.SportDao;
import com.emse.spring.cartel.dto.EcoleDto;
import com.emse.spring.cartel.dto.SportDto;
import com.emse.spring.cartel.model.Sport;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/sport")
@Transactional
public class SportController {
    private final SportDao sportDao;

    public SportController(SportDao sportDao){
        this.sportDao=sportDao;
    }

    @GetMapping
    public List<SportDto> findAll(){
        return sportDao.findAll().stream().map(SportDto::new).collect(Collectors.toList());
    }

    @GetMapping (path="/{id}")
    public SportDto findById(@PathVariable Long id) {
        Sport sport= sportDao.getById(id);
        return new SportDto(sport);
    }


}
