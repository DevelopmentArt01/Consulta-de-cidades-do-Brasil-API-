package com.apirest.cidadesdobrasil.entities.state.repositories;

import com.apirest.cidadesdobrasil.entities.state.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StatesRepository  extends JpaRepository<State,Long> {
}

