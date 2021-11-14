package com.emse.spring.cartel.api;
import com.emse.spring.cartel.dao.EcoleDao;


import com.emse.spring.cartel.dto.EcoleDto;
import com.emse.spring.cartel.model.Ecole;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController // (1)
@RequestMapping("/api/ecole") // (2)
@Transactional // (3)

public class EcoleController {
    private final EcoleDao ecoleDao;

    public EcoleController(EcoleDao ecoleDao){
        this.ecoleDao=ecoleDao;
    }

    @GetMapping
    public List<EcoleDto> findAll(){
        return ecoleDao.findAll().stream().map(EcoleDto::new).collect(Collectors.toList());
    }

    @GetMapping (path="/{id}")
    public EcoleDto findById(@PathVariable Long id) {
        Ecole ecole= ecoleDao.getById(id);
        return new EcoleDto(ecole);
    }


}
