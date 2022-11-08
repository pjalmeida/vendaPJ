package org.acme.controller;

import org.acme.model.Categoria;
import io.quarkus.hibernate.orm.panache.runtime.JpaOperations;

import javax.persistence.OptimisticLockException;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/categoria")
public class CategoriaResource {
    @Transactional
    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") long id) {
        System.out.println("Excluindo " + id);
        Categoria.deleteById(id);
    }

    @GET
    public List<Categoria> getAll() {
        return Categoria.listAll();
    }

    @GET
    @Path("{id}")
    public Categoria getById(@PathParam("id") long id) {
        return Categoria.findById(id);
    }

    @Transactional
    @POST
    public void insert(Categoria categoria) {
        Categoria.persist(categoria);

    }

    @Transactional
    @Path("/{id}")
    @PUT
    public void update( @PathParam("id") Long id,Categoria categoria) {

        try {
            var  em = JpaOperations.INSTANCE.getEntityManager();
            em.merge(categoria);
        }catch (OptimisticLockException e){
            throw new WebApplicationException("Registro alterado por outro usuario");
        }
    }


}