/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Service;

import Model.Entity.SheepShopAddress;
import Model.Return.reDistance;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author DTT
 */
@Stateless
@Path("model.entity.sheepshopaddress")
public class SheepShopAddressFacadeREST extends AbstractFacade<SheepShopAddress> {
    @PersistenceContext(unitName = "TheSHEEPPU")
    private EntityManager em;

    public SheepShopAddressFacadeREST() {
        super(SheepShopAddress.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(SheepShopAddress entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, SheepShopAddress entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public SheepShopAddress find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<SheepShopAddress> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<SheepShopAddress> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @GET
    @Path("distace/{shop_id}")
    @Produces({"application/xml", "application/json"})
    public reDistance distanceREST(@PathParam("shop_id") Integer shop_id) {
        return new reDistance("1", BigDecimal.ZERO, BigDecimal.ZERO);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
