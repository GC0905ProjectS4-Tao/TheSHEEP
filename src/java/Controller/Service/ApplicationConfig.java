/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author DTT
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(Controller.Service.SheepAccountFacadeREST.class);
        resources.add(Controller.Service.SheepOrderFacadeREST.class);
        resources.add(Controller.Service.SheepRoleFacadeREST.class);
        resources.add(Controller.Service.SheepShopAddressFacadeREST.class);
        resources.add(Controller.Service.SheepShopFacadeREST.class);
        resources.add(Controller.Service.SheepShopPhoneFacadeREST.class);
    }
    
}
