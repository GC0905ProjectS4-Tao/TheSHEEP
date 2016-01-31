/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Return;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class reDistance implements Serializable{
    protected String distance;
    protected BigDecimal moneypermile, totalmoney;

    public reDistance(String distance, BigDecimal moneypermile, BigDecimal money) {
        this.distance = distance;
        this.moneypermile = moneypermile;
        this.totalmoney = money;
    }

    public reDistance() {
    }


    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public BigDecimal getMoneypermile() {
        return moneypermile;
    }

    public void setMoneypermile(BigDecimal moneypermile) {
        this.moneypermile = moneypermile;
    }

    public BigDecimal getMoney() {
        return totalmoney;
    }

    public void setMoney(BigDecimal totalmoney) {
        this.totalmoney = totalmoney;
    }

    @Override
    public String toString() {
        return "reDistance{" + "distance=" + distance + ", moneypermile=" + moneypermile + ", totalmoney=" + totalmoney + '}';
    }
    
    
}
