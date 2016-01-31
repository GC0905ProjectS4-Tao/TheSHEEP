/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Sess;

import Model.Entity.SheepAccount;
import Controller.MD5;
import java.math.BigInteger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

    public boolean createAccount(String user, String pass) {
        SheepAccount acc = new SheepAccount();
        acc.setUsername(user);
        acc.setPassword(MD5.encrypt(pass));
        em.persist(acc);

        return true;
    }

    public boolean login(String user, String pass) {
        SheepAccount acc = new SheepAccount();
        acc.setUsername(user);
        acc.setPassword(MD5.encrypt(pass));

        return true;
    }

    public boolean recharge(String user, String money) {
        SheepAccount acc = new SheepAccount();
        acc.setUsername(user);
        acc.setBalance(money);
        em.merge(acc);
        return true;
    }

    @Override
    public boolean transfer(String user, String user2, String money, Boolean pay) {
        Query qr = em.createNamedQuery("SheepAccount.findByUsername");
        qr.setParameter("user", user);
        int imoney = Integer.parseInt(money);
        int fee = 0;
        String temp = "";
        if (imoney < 100000) {
            fee = 10000;
        } else if (imoney > 100000 && imoney <= 500000) {
            fee = imoney * 2 / 100;
        } else if (imoney > 500000 && imoney <= 1000000) {
            fee = imoney * 3 / 200;
        } else if (imoney > 1000000 && imoney <= 5000000) {
            fee = imoney / 100;
        } else if (imoney > 5000000) {
            fee = imoney / 200;
        }

        try {
            SheepAccount acc = (SheepAccount) qr.getSingleResult();
            if (pay == true) {
                temp = Integer.toString((Integer.parseInt(acc.getBalance()) - imoney - fee));
            } else {
                temp = Integer.toString((Integer.parseInt(acc.getBalance()) - imoney));
            }
            acc.setBalance(temp);
            em.merge(acc);
        } catch (Exception e) {
            return false;
        }

        qr = em.createNamedQuery("SheepAccount.findByUsername");
        qr.setParameter("user", user2);

        try {
            SheepAccount acc = (SheepAccount) qr.getSingleResult();
            if (pay == true) {
                temp = Integer.toString((Integer.parseInt(acc.getBalance()) + imoney));
            } else {
                temp = Integer.toString((Integer.parseInt(acc.getBalance()) + imoney - fee));
            }
            acc.setBalance(temp);
            em.merge(acc);
        } catch (Exception e) {
            return false;
        }
        
        return true;
    }

}
