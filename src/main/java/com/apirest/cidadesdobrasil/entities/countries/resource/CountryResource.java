package com.apirest.cidadesdobrasil.entities.countries.resource;


import com.apirest.cidadesdobrasil.entities.countries.entity.Country;
import com.apirest.cidadesdobrasil.entities.countries.repositories.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("countries")
public class CountryResource {


    private final CountryRepository countryRepository;

     public  CountryResource(CountryRepository countryRepository){
           this.countryRepository = countryRepository;
     }


    @GetMapping
    public Page<Country> countries(Pageable pageable){

     return this.countryRepository.findAll(pageable);
  }

  @GetMapping("/{id}")
  public ResponseEntity getOne(@PathVariable  Long id){

         Optional<Country> optional = this.countryRepository.findById(id);

         if (optional.isPresent())
         return ResponseEntity.ok().body(optional.get());
         else
             return ResponseEntity.notFound().build();



     }

}
