/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.Dog;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import st.dog.dip.domain.Breeder.Breeder;
import st.dog.dip.domain.Breeder.Breeder;
import st.dog.dip.domain.Owner.Owner;

/**
 *
 * @author moneg
 */
@Entity
@Table(name = "dog")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dog.findAll", query = "SELECT d FROM Dog d"),
    @NamedQuery(name = "Dog.findById", query = "SELECT d FROM Dog d WHERE d.id = :id"),
    @NamedQuery(name = "Dog.findByBreed", query = "SELECT d FROM Dog d WHERE d.breed = :breed"),
    @NamedQuery(name = "Dog.findByGender", query = "SELECT d FROM Dog d WHERE d.gender = :gender"),
    @NamedQuery(name = "Dog.findByName", query = "SELECT d FROM Dog d WHERE d.name = :name"),
    @NamedQuery(name = "Dog.findByDob", query = "SELECT d FROM Dog d WHERE d.dob = :dob"),
    @NamedQuery(name = "Dog.findByColor", query = "SELECT d FROM Dog d WHERE d.color = :color"),
    @NamedQuery(name = "Dog.findByChip", query = "SELECT d FROM Dog d WHERE d.chip = :chip"),
    @NamedQuery(name = "Dog.findByBrand", query = "SELECT d FROM Dog d WHERE d.brand = :brand"),
    @NamedQuery(name = "Dog.findByPedigree", query = "SELECT d FROM Dog d WHERE d.pedigree = :pedigree"),
    @NamedQuery(name = "Dog.findBySire", query = "SELECT d FROM Dog d WHERE d.sire = :sire"),
    @NamedQuery(name = "Dog.findByDam", query = "SELECT d FROM Dog d WHERE d.dam = :dam"),
    @NamedQuery(name = "Dog.findByFcigroup", query = "SELECT d FROM Dog d WHERE d.fcigroup = :fcigroup"),
    @NamedQuery(name = "Dog.findByOwnerId", query = "SELECT d FROM Dog d WHERE d.ownerId = :ownerId"),
    @NamedQuery(name = "Dog.findByBreederId", query = "SELECT d FROM Dog d WHERE d.breederId = :breederId")})
public class Dog implements Serializable {

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "dog")
    private Owner owner;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "breed")
    private String breed;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Basic(optional = false)
    @Column(name = "color")
    private String color;
    @Basic(optional = false)
    @Column(name = "chip")
    private String chip;
    @Basic(optional = false)
    @Column(name = "brand")
    private String brand;
    @Basic(optional = false)
    @Column(name = "pedigree")
    private String pedigree;
    @Basic(optional = false)
    @Column(name = "sire")
    private String sire;
    @Basic(optional = false)
    @Column(name = "dam")
    private String dam;
    @Basic(optional = false)
    @Column(name = "fcigroup")
    private int fcigroup;
    @Basic(optional = false)
    @Column(name = "ownerId")
    private int ownerId;
    @Basic(optional = false)
    @Column(name = "breederId")
    private int breederId;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "dog")
    private Breeder breeder;

    public Dog() {
    }

    public Dog(Integer id) {
        this.id = id;
    }

    public Dog(Integer id, String breed, String gender, String name, Date dob, String color, String chip, String brand, String pedigree, String sire, String dam, int fcigroup, int ownerId, int breederId) {
        this.id = id;
        this.breed = breed;
        this.gender = gender;
        this.name = name;
        this.dob = dob;
        this.color = color;
        this.chip = chip;
        this.brand = brand;
        this.pedigree = pedigree;
        this.sire = sire;
        this.dam = dam;
        this.fcigroup = fcigroup;
        this.ownerId = ownerId;
        this.breederId = breederId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public String getSire() {
        return sire;
    }

    public void setSire(String sire) {
        this.sire = sire;
    }

    public String getDam() {
        return dam;
    }

    public void setDam(String dam) {
        this.dam = dam;
    }

    public int getFcigroup() {
        return fcigroup;
    }

    public void setFcigroup(int fcigroup) {
        this.fcigroup = fcigroup;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getBreederId() {
        return breederId;
    }

    public void setBreederId(int breederId) {
        this.breederId = breederId;
    }

    public Breeder getBreeder() {
        return breeder;
    }

    public void setBreeder(Breeder breeder) {
        this.breeder = breeder;
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
        if (!(object instanceof Dog)) {
            return false;
        }
        Dog other = (Dog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "st.dog.dip.domain.Breeder.Dog[ id=" + id + " ]";
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    
}
