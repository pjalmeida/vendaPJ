package com.manoelcampos.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import org.hibernate.tuple.entity.AbstractEntityBasedAttribute;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Categoria extends AbstractEntity{

    @OneToMany(mappedBy = "categoria")
    public List<Produto>produtos=new ArrayList<>();
    public String descricao;
    public String sigla;

    public Categoria() {
    }

    public Categoria(long id, String descricao, String sigla) {
        this.id = id;
        this.descricao = descricao;
        this.sigla = sigla;
    }
}
