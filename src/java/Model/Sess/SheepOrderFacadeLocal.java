/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Sess;

import Model.Entity.SheepOrder;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DTT
 */
@Local
public interface SheepOrderFacadeLocal {

    void create(SheepOrder sheepOrder);

    void edit(SheepOrder sheepOrder);

    void remove(SheepOrder sheepOrder);

    SheepOrder find(Object id);

    List<SheepOrder> findAll();

    List<SheepOrder> findRange(int[] range);

    int count();
    
}
