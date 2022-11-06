package com.manoelcampos.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity extends PanacheEntityBase {
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    public java.lang.Long id;

}
