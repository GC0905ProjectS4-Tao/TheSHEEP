/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

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
@Table(name = "sheep_shop_phone")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SheepShopPhone.findAll", query = "SELECT s FROM SheepShopPhone s"),
    @NamedQuery(name = "SheepShopPhone.findById", query = "SELECT s FROM SheepShopPhone s WHERE s.id = :id"),
    @NamedQuery(name = "SheepShopPhone.findByIdAddress", query = "SELECT s FROM SheepShopPhone s WHERE s.idAddress = :idAddress"),
    @NamedQuery(name = "SheepShopPhone.findByPhoneNumber", query = "SELECT s FROM SheepShopPhone s WHERE s.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "SheepShopPhone.findByCreated", query = "SELECT s FROM SheepShopPhone s WHERE s.created = :created")})
public class SheepShopPhone implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_address")
    private int idAddress;
    @Size(max = 2147483647)
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    public SheepShopPhone() {
    }

    public SheepShopPhone(Integer id) {
        this.id = id;
    }

    public SheepShopPhone(Integer id, int idAddress) {
        this.id = id;
        this.idAddress = idAddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
        if (!(object instanceof SheepShopPhone)) {
            return false;
        }
        SheepShopPhone other = (SheepShopPhone) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.SheepShopPhone[ id=" + id + " ]";
    }
    
}
