/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.Dogshow;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author moneg
 */
@Entity
@Table(name = "dogshow")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dogshow.findAll", query = "SELECT d FROM Dogshow d"),
    @NamedQuery(name = "Dogshow.findById", query = "SELECT d FROM Dogshow d WHERE d.id = :id"),
    @NamedQuery(name = "Dogshow.findByTitle", query = "SELECT d FROM Dogshow d WHERE d.title = :title"),
    @NamedQuery(name = "Dogshow.findByDate", query = "SELECT d FROM Dogshow d WHERE d.date = :date"),
    @NamedQuery(name = "Dogshow.findBySponsor", query = "SELECT d FROM Dogshow d WHERE d.sponsor = :sponsor"),
    @NamedQuery(name = "Dogshow.findByDescription", query = "SELECT d FROM Dogshow d WHERE d.description = :description"),
    @NamedQuery(name = "Dogshow.findByAddress", query = "SELECT d FROM Dogshow d WHERE d.address = :address"),
    @NamedQuery(name = "Dogshow.findByOrganizer", query = "SELECT d FROM Dogshow d WHERE d.organizer = :organizer")})
public class Dogshow implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @Column(name = "sponsor")
    private String sponsor;
    @Basic(optional = false)
    @Lob
    @Column(name = "picture")
    private byte[] picture;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "organizer")
    private String organizer;

    public Dogshow() {
    }

    public Dogshow(Integer id) {
        this.id = id;
    }

    public Dogshow(Integer id, String title, Date date, String sponsor, byte[] picture, String description, String address, String organizer) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.sponsor = sponsor;
        this.picture = picture;
        this.description = description;
        this.address = address;
        this.organizer = organizer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
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
        if (!(object instanceof Dogshow)) {
            return false;
        }
        Dogshow other = (Dogshow) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "st.dog.dip.domain.Dogshow.Dogshow[ id=" + id + " ]";
    }
    
}
