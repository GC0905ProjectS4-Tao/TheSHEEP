/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DTT
 */
@Entity
@Table(name = "sheep_shop_address")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SheepShopAddress.findAll", query = "SELECT s FROM SheepShopAddress s"),
    @NamedQuery(name = "SheepShopAddress.findById", query = "SELECT s FROM SheepShopAddress s WHERE s.id = :id"),
    @NamedQuery(name = "SheepShopAddress.findByShopId", query = "SELECT s FROM SheepShopAddress s WHERE s.shopId = :shopId"),
    @NamedQuery(name = "SheepShopAddress.findByAddress", query = "SELECT s FROM SheepShopAddress s WHERE s.address = :address"),
    @NamedQuery(name = "SheepShopAddress.findByCreated", query = "SELECT s FROM SheepShopAddress s WHERE s.created = :created")})
public class SheepShopAddress implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "shop_id")
    private int shopId;
    @Size(max = 2147483647)
    @Column(name = "address")
    private String address;
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    public SheepShopAddress() {
    }

    public SheepShopAddress(Integer id) {
        this.id = id;
    }

    public SheepShopAddress(Integer id, int shopId) {
        this.id = id;
        this.shopId = shopId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
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
        if (!(object instanceof SheepShopAddress)) {
            return false;
        }
        SheepShopAddress other = (SheepShopAddress) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.SheepShopAddress[ id=" + id + " ]";
    }
    
}
