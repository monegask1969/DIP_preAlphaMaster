/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.service.Dog;

import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import st.dog.dip.domain.Dog.Dog;
import st.dog.dip.domain.Dog.DogDAO;
import st.dog.dip.service.ODEException.ODEException;

/**
 *
 * @author moneg
 */
public class DogServiceImpl implements DogService{

     @Autowired
    private DogDAO dogDao;
    
    @Override
    public Dog getById(int id) {
         Dog d = null;
        try{
            d = dogDao.getById(id);
            if(d == null){
                throw new ODEException("such Dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dog getByBreed(String breed) {
        Dog d = null;
        try{
            d = dogDao.getByBreed(breed);
            if(d == null){
                throw new ODEException("such Dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dog getByGender(String gender) {
        Dog d = null;
        try{
            d = dogDao.getByGender(gender);
            if(d == null){
                throw new ODEException("such Dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dog getByName(String name) {
        Dog d = null;
        try{
            d = dogDao.getByName(name);
            if(d == null){
                throw new ODEException("such Dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dog getByDob(Date dob) {
        Dog d = null;
        try{
            d = dogDao.getByDob(dob);
            if(d == null){
                throw new ODEException("such Dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dog getByColor(String color) {
        Dog d = null;
        try{
            d = dogDao.getByColor(color);
            if(d == null){
                throw new ODEException("such Dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dog getByChip(String chip) {
        Dog d = null;
        try{
            d = dogDao.getByChip(chip);
            if(d == null){
                throw new ODEException("such Dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dog getByBrand(String brand) {
        Dog d = null;
        try{
            d = dogDao.getByBrand(brand);
            if(d == null){
                throw new ODEException("such Dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dog getByPedigree(String pedigree) {
        Dog d = null;
        try{
            d = dogDao.getByPedigree(pedigree);
            if(d == null){
                throw new ODEException("such Dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dog getBySire(String sire) {
        Dog d = null;
        try{
            d = dogDao.getBySire(sire);
            if(d == null){
                throw new ODEException("such Dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dog getByDam(String dam) {
        Dog d = null;
        try{
            d = dogDao.getByDam(dam);
            if(d == null){
                throw new ODEException("such Dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dog getByFciGroup(int fcigroup) {
        Dog d = null;
        try{
            d = dogDao.getByFciGroup(fcigroup);
            if(d == null){
                throw new ODEException("such Dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dog getByOwnerId(int ownerid) {
        Dog d = null;
        try{
            d = dogDao.getByOwnerId(ownerid);
            if(d == null){
                throw new ODEException("such Dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public Dog getByBreederId(int breederid) {
        Dog d = null;
        try{
            d = dogDao.getByBreederId(breederid);
            if(d == null){
                throw new ODEException("such Dog is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dog does not exist");
            throw ex;
        }
        return d;
    }

    @Override
    public List<Dog> getList() {
        List<Dog> d = null;
        try{
            d = dogDao.getList();
            System.out.println(d.get(0));
        }catch(HibernateException ex){
            ex.printStackTrace();
            System.out.println("hibernate exception occured");
        }catch(Exception ex){
            System.out.println((ex.getClass()).getName()+ " exception occured");
        }
        return d;
    }
    
}
