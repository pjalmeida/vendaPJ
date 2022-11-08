package org.acme.controller;

import org.acme.model.Produto;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.MethodProperties;

public interface ProdutoResourse extends PanacheEntityResource<Produto, Long> {
    @Override
    @MethodProperties(exposed = false)
    boolean delete(Long id);

}
