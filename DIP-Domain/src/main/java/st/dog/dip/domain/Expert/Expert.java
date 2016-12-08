/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.Expert;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author moneg
 */
@Entity
@Table(name = "expert")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Expert.findAll", query = "SELECT e FROM Expert e"),
    @NamedQuery(name = "Expert.findById", query = "SELECT e FROM Expert e WHERE e.id = :id"),
    @NamedQuery(name = "Expert.findByFname", query = "SELECT e FROM Expert e WHERE e.fname = :fname"),
    @NamedQuery(name = "Expert.findBySname", query = "SELECT e FROM Expert e WHERE e.sname = :sname"),
    @NamedQuery(name = "Expert.findByLname", query = "SELECT e FROM Expert e WHERE e.lname = :lname"),
    @NamedQuery(name = "Expert.findByCountry", query = "SELECT e FROM Expert e WHERE e.country = :country"),
    @NamedQuery(name = "Expert.findByDescription", query = "SELECT e FROM Expert e WHERE e.description = :description")})
public class Expert implements Serializable {

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
    @Basic(optional = false)
    @Column(name = "country")
    private String country;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;

    public Expert() {
    }

    public Expert(Integer id) {
        this.id = id;
    }

    public Expert(Integer id, String fname, String sname, String lname, String country, String description) {
        this.id = id;
        this.fname = fname;
        this.sname = sname;
        this.lname = lname;
        this.country = country;
        this.description = description;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(object instanceof Expert)) {
            return false;
        }
        Expert other = (Expert) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "st.dog.dip.domain.Expert.Expert[ id=" + id + " ]";
    }
    
}
