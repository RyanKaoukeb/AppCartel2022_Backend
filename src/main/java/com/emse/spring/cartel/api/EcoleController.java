package com.emse.spring.cartel.api;
import com.emse.spring.cartel.dao.EcoleDao;
import com.emse.spring.cartel.dto.EcoleDto;
import com.emse.spring.cartel.model.Ecole;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/ecole")
@Transactional

public class EcoleController {
    private final EcoleDao ecoleDao;
    public EcoleController(EcoleDao ecoleDao){
        this.ecoleDao=ecoleDao;
    } //Basic Constructor

    @GetMapping
    //Function to list all schools in the database
    public List<EcoleDto> findAll(){
        return ecoleDao.findAll().stream().map(EcoleDto::new).collect(Collectors.toList());
    }

    @GetMapping (path="/{id}")
    //Function to find a school by a particular id (not used in the app)
    public EcoleDto findById(@PathVariable Long id) {
        Ecole ecole= ecoleDao.getById(id);
        return new EcoleDto(ecole);
    }


}
