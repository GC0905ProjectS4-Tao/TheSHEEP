/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Model.Sess.SheepShopAddressFacadeLocal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author DTT
 */
public class test2 {
    SheepShopAddressFacadeLocal sheepShopAddressFacade = lookupSheepShopAddressFacadeLocal();

    private SheepShopAddressFacadeLocal lookupSheepShopAddressFacadeLocal() {
        try {
            Context c = new InitialContext();
            return (SheepShopAddressFacadeLocal) c.lookup("java:global/TheSHEEP/SheepShopAddressFacade!Model.Sess.SheepShopAddressFacadeLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
//    public static void main(String[] args) throws Exception {
//        System.out.println(sheepShopAddressFacade.count());
//    }

}
