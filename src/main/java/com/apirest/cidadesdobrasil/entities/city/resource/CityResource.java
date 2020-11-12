package com.apirest.cidadesdobrasil.entities.city.resource;


import com.apirest.cidadesdobrasil.entities.city.entity.City;
import com.apirest.cidadesdobrasil.entities.city.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityResource {

 @Autowired
 private CityRepository cityRepository;


  @GetMapping
  public Page<City> cities(Pageable pageable){
         return this.cityRepository.findAll(pageable);
   }


}
