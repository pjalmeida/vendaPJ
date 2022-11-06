package com.manoelcampos;

import com.manoelcampos.model.Produto;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

public interface ProdutoResourse extends PanacheEntityResource<Produto, Long> {

}
