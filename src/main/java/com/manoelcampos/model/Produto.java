package com.manoelcampos.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.io.ObjectInputStream;
import java.util.Objects;

@Entity
public class Produto extends AbstractEntity{
    public String nome;

    @ManyToOne
    public Categoria categoria;

    public void setNome(String nome) {
        Objects.requireNonNull(nome,"nome não pode ser nulo");
        this.nome = nome.trim().toUpperCase();
    }
}
