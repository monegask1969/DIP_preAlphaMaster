/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.Breeder;

import st.dog.dip.domain.Dog.Dog;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author moneg
 */
@Entity
@Table(name = "breeder")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Breeder.findAll", query = "SELECT b FROM Breeder b"),
    @NamedQuery(name = "Breeder.findById", query = "SELECT b FROM Breeder b WHERE b.id = :id"),
    @NamedQuery(name = "Breeder.findByFname", query = "SELECT b FROM Breeder b WHERE b.fname = :fname"),
    @NamedQuery(name = "Breeder.findBySname", query = "SELECT b FROM Breeder b WHERE b.sname = :sname"),
    @NamedQuery(name = "Breeder.findByLname", query = "SELECT b FROM Breeder b WHERE b.lname = :lname")})
public class Breeder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "fname")
    private String fname;
    @Basic(optional = false)
    @Column(name = "sname")
    private String sname;
    @Basic(optional = false)
    @Column(name = "lname")
    private String lname;
    @JoinColumn(name = "id", referencedColumnName = "breederId", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Dog dog;

    public Breeder() {
    }

    public Breeder(Integer id) {
        this.id = id;
    }

    public Breeder(Integer id, String fname, String sname, String lname) {
        this.id = id;
        this.fname = fname;
        this.sname = sname;
        this.lname = lname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
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
        if (!(object instanceof Breeder)) {
            return false;
        }
        Breeder other = (Breeder) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "st.dog.dip.domain.Breeder.Breeder[ id=" + id + " ]";
    }
    
}
