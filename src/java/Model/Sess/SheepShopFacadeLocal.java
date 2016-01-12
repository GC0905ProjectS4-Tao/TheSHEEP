/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Sess;

import Model.Entity.SheepShop;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DTT
 */
@Local
public interface SheepShopFacadeLocal {

    void create(SheepShop sheepShop);

    void edit(SheepShop sheepShop);

    void remove(SheepShop sheepShop);

    SheepShop find(Object id);

    List<SheepShop> findAll();

    List<SheepShop> findRange(int[] range);

    int count();
    
}
