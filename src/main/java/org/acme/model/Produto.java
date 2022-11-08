package org.acme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import java.util.Objects;

@Entity
public class Produto extends AbstractEntity{

    @Version
    @Column(columnDefinition = "int default 0")
    public long version = 0L;
    public String nome;

    @ManyToOne
    public Categoria categoria;

    public void setNome(String nome) {
        Objects.requireNonNull(nome,"nome não pode ser nulo");
        this.nome = nome.trim().toUpperCase();
    }
}
