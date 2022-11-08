package org.acme.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Categoria extends AbstractEntity{
    @Version
    @Column(columnDefinition = "int default 0")
    public long version =0L;


    @JsonIgnore
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
