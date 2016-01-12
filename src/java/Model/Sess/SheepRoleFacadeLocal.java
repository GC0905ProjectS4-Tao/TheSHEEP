/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Sess;

import Model.Entity.SheepRole;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DTT
 */
@Local
public interface SheepRoleFacadeLocal {

    void create(SheepRole sheepRole);

    void edit(SheepRole sheepRole);

    void remove(SheepRole sheepRole);

    SheepRole find(Object id);

    List<SheepRole> findAll();

    List<SheepRole> findRange(int[] range);

    int count();
    
}
