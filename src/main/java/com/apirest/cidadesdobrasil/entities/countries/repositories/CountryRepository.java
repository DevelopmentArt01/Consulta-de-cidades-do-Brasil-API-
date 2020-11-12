package com.apirest.cidadesdobrasil.entities.countries.repositories;

import com.apirest.cidadesdobrasil.entities.countries.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country ,Long> {
}
