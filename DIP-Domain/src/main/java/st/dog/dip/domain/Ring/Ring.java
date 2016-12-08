/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.Ring;

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
@Table(name = "ring")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ring.findAll", query = "SELECT r FROM Ring r"),
    @NamedQuery(name = "Ring.findById", query = "SELECT r FROM Ring r WHERE r.id = :id"),
    @NamedQuery(name = "Ring.findByDogshowId", query = "SELECT r FROM Ring r WHERE r.dogshowId = :dogshowId"),
    @NamedQuery(name = "Ring.findByTitle", query = "SELECT r FROM Ring r WHERE r.title = :title")})
public class Ring implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "dogshow_id")
    private int dogshowId;
    @Basic(optional = false)
    @Column(name = "title")
    private String title;

    public Ring() {
    }

    public Ring(Integer id) {
        this.id = id;
    }

    public Ring(Integer id, int dogshowId, String title) {
        this.id = id;
        this.dogshowId = dogshowId;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDogshowId() {
        return dogshowId;
    }

    public void setDogshowId(int dogshowId) {
        this.dogshowId = dogshowId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        if (!(object instanceof Ring)) {
            return false;
        }
        Ring other = (Ring) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "st.dog.dip.domain.Ring.Ring[ id=" + id + " ]";
    }
    
}
