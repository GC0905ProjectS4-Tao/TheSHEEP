/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Model.Sess.SheepShopAddressFacadeLocal;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author DTT
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {
    @EJB
    private SheepShopAddressFacadeLocal sheepShopAddressFacade;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return Integer.toString(sheepShopAddressFacade.count());
    }
}
