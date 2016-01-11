/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess;

import Entity.SheepAccount;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DTT
 */
@Stateless
public class SheepAccountFacade extends AbstractFacade<SheepAccount> implements SheepAccountFacadeLocal {
    @PersistenceContext(unitName = "TheSHEEPPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SheepAccountFacade() {
        super(SheepAccount.class);
    }
    
}
