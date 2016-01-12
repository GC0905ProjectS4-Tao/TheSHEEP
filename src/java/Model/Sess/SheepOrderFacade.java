/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Sess;

import Model.Entity.SheepOrder;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DTT
 */
@Stateless
public class SheepOrderFacade extends AbstractFacade<SheepOrder> implements SheepOrderFacadeLocal {
    @PersistenceContext(unitName = "TheSHEEPPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SheepOrderFacade() {
        super(SheepOrder.class);
    }
    
}
