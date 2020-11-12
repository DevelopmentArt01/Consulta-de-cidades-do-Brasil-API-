package com.apirest.cidadesdobrasil.entities.state.resource;

import com.apirest.cidadesdobrasil.entities.state.entity.State;
import com.apirest.cidadesdobrasil.entities.state.repositories.StatesRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("staties")
public class StatesResource {

    @Autowired
    private StatesRepository repository;

//    public StatesResource(final StatesRepository repository) {
//        this.repository = repository;
//    }

    @GetMapping
    public List<State> staties() {
        return repository.findAll();
    }
}