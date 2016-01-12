/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DTT
 */
@Entity
@Table(name = "sheep_role")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SheepRole.findAll", query = "SELECT s FROM SheepRole s"),
    @NamedQuery(name = "SheepRole.findById", query = "SELECT s FROM SheepRole s WHERE s.id = :id"),
    @NamedQuery(name = "SheepRole.findByRoleId", query = "SELECT s FROM SheepRole s WHERE s.roleId = :roleId"),
    @NamedQuery(name = "SheepRole.findByAccId", query = "SELECT s FROM SheepRole s WHERE s.accId = :accId"),
    @NamedQuery(name = "SheepRole.findByShopId", query = "SELECT s FROM SheepRole s WHERE s.shopId = :shopId")})
public class SheepRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "role_id")
    private int roleId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "acc_id")
    private int accId;
    @Column(name = "shop_id")
    private Integer shopId;

    public SheepRole() {
    }

    public SheepRole(Integer id) {
        this.id = id;
    }

    public SheepRole(Integer id, int roleId, int accId) {
        this.id = id;
        this.roleId = roleId;
        this.accId = accId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SheepRole)) {
            return false;
        }
        SheepRole other = (SheepRole) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.SheepRole[ id=" + id + " ]";
    }
    
}
