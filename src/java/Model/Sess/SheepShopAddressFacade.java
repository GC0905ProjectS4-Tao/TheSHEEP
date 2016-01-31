/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Sess;

import Model.Entity.SheepShopAddress;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author DTT
 */
@Stateless
public class SheepShopAddressFacade extends AbstractFacade<SheepShopAddress> implements SheepShopAddressFacadeLocal {

    @PersistenceContext(unitName = "TheSHEEPPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SheepShopAddressFacade() {
        super(SheepShopAddress.class);
    }

    @Override
    public String getShippingFees(int id) {
        Query query = em.createNamedQuery("SheepShopAddress.findById");
        query.setParameter("id", id);
        try {
            SheepShopAddress ssa = (SheepShopAddress) query.getSingleResult();
            System.out.println(ssa.getShippingFees());
            return ssa.getShippingFees();
        } catch (Exception e) {
            System.out.println("SESSION FALSE");
            return "SESSION FALSE";
        }
    }

}
