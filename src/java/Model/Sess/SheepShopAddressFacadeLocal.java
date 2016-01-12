/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Sess;

import Model.Entity.SheepShopAddress;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DTT
 */
@Local
public interface SheepShopAddressFacadeLocal {

    void create(SheepShopAddress sheepShopAddress);

    void edit(SheepShopAddress sheepShopAddress);

    void remove(SheepShopAddress sheepShopAddress);

    SheepShopAddress find(Object id);

    List<SheepShopAddress> findAll();

    List<SheepShopAddress> findRange(int[] range);

    int count();
    
}
