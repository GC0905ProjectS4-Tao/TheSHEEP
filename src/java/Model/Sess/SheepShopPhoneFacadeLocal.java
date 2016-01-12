/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Sess;

import Model.Entity.SheepShopPhone;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DTT
 */
@Local
public interface SheepShopPhoneFacadeLocal {

    void create(SheepShopPhone sheepShopPhone);

    void edit(SheepShopPhone sheepShopPhone);

    void remove(SheepShopPhone sheepShopPhone);

    SheepShopPhone find(Object id);

    List<SheepShopPhone> findAll();

    List<SheepShopPhone> findRange(int[] range);

    int count();
    
}
