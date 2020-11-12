package com.apirest.cidadesdobrasil.entities.city.entity;

import com.apirest.cidadesdobrasil.entities.city.entity.pointtype.PointType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.geo.Point;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "cidade")
@TypeDefs(value = {
        @TypeDef(name = "point", typeClass = PointType.class)
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private Integer uf;

    private Integer ibge;

    @Column(name = "lat_lon")
   private String geoLocation;

    @Type(type = "point")
    @Column(name = "lat_lion", updatable = false, insertable = false)
    private Point location;

}

