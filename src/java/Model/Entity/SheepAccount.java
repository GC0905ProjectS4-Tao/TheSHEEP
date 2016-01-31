/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "sheep_account")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SheepAccount.findAll", query = "SELECT s FROM SheepAccount s"),
    @NamedQuery(name = "SheepAccount.findById", query = "SELECT s FROM SheepAccount s WHERE s.id = :id"),
    @NamedQuery(name = "SheepAccount.findByUsername", query = "SELECT s FROM SheepAccount s WHERE s.username = :username"),
    @NamedQuery(name = "SheepAccount.findByPassword", query = "SELECT s FROM SheepAccount s WHERE s.password = :password"),
    @NamedQuery(name = "SheepAccount.findByActive", query = "SELECT s FROM SheepAccount s WHERE s.active = :active"),
    @NamedQuery(name = "SheepAccount.findByVerify", query = "SELECT s FROM SheepAccount s WHERE s.verify = :verify"),
    @NamedQuery(name = "SheepAccount.findByFullname", query = "SELECT s FROM SheepAccount s WHERE s.fullname = :fullname"),
    @NamedQuery(name = "SheepAccount.findByEmail", query = "SELECT s FROM SheepAccount s WHERE s.email = :email"),
    @NamedQuery(name = "SheepAccount.findByPhoneNumber", query = "SELECT s FROM SheepAccount s WHERE s.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "SheepAccount.findByCreated", query = "SELECT s FROM SheepAccount s WHERE s.created = :created"),
    @NamedQuery(name = "SheepAccount.findByEdited", query = "SELECT s FROM SheepAccount s WHERE s.edited = :edited"),
    @NamedQuery(name = "SheepAccount.findByBalance", query = "SELECT s FROM SheepAccount s WHERE s.balance = :balance")})
public class SheepAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "password")
    private String password;
    @Column(name = "active")
    private Boolean active;
    @Size(max = 4)
    @Column(name = "verify")
    private String verify;
    @Size(max = 2147483647)
    @Column(name = "fullname")
    private String fullname;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 2147483647)
    @Column(name = "email")
    private String email;
    @Size(max = 2147483647)
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Column(name = "edited")
    @Temporal(TemporalType.TIMESTAMP)
    private Date edited;
    @Column(name = "balance")
    private String balance;

    public SheepAccount() {
    }

    public SheepAccount(Integer id) {
        this.id = id;
    }

    public SheepAccount(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Date getEdited() {
        return edited;
    }

    public void setEdited(Date edited) {
        this.edited = edited;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
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
        if (!(object instanceof SheepAccount)) {
            return false;
        }
        SheepAccount other = (SheepAccount) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.SheepAccount[ id=" + id + " ]";
    }
    
}
