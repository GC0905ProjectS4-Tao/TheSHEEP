/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Sess;

import Model.Entity.SheepAccount;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DTT
 */
@Local
public interface SheepAccountFacadeLocal {

    void create(SheepAccount sheepAccount);

    void edit(SheepAccount sheepAccount);

    void remove(SheepAccount sheepAccount);

    SheepAccount find(Object id);

    List<SheepAccount> findAll();

    List<SheepAccount> findRange(int[] range);

    int count();
    
}
