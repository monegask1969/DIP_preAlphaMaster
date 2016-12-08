/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.service.Breeder;

import java.util.List;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import st.dog.dip.domain.Breeder.Breeder;
import st.dog.dip.domain.Breeder.BreederDAO;
import st.dog.dip.domain.Dog.Dog;
import st.dog.dip.service.ODEException.ODEException;

/**
 *
 * @author moneg
 */
public class BreederServiceImpl implements BreederService{

    @Autowired
    private BreederDAO breederDao;
    
    @Override
    public Breeder getById(int id) {
         Breeder b = null;
        try{
            b = breederDao.getById(id);
            if(b == null){
                throw new ODEException("such Breeder is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Breeder does not exist");
            throw ex;
        }
        return b;
    }

    @Override
    public Breeder getByFname(String fname) {
        Breeder b = null;
        try{
            b = breederDao.getByFname(fname);
            if(b == null){
                throw new ODEException("such Breeder is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Breeder does not exist");
            throw ex;
        }
        return b;
    }

    @Override
    public Breeder getBySname(String sname) {
        Breeder b = null;
        try{
            b = breederDao.getBySname(sname);
            if(b == null){
                throw new ODEException("such Breeder is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Breeder does not exist");
            throw ex;
        }
        return b;
    }

    @Override
    public Breeder getByLname(String lname) {
        Breeder b = null;
        try{
            b = breederDao.getByLname(lname);
            if(b == null){
                throw new ODEException("such Breeder is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Breeder does not exist");
            throw ex;
        }
        return b;
    }

    @Override
    public Breeder getByDog(Dog dog) {
       Breeder b = null;
        try{
            b = breederDao.getByDog(dog);
            if(b == null){
                throw new ODEException("such Breeder is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Breeder does not exist");
            throw ex;
        }
        return b;
    }

    @Override
    public List<Breeder> getList() {
        List<Breeder> b = null;
        try{
            b = breederDao.getList();
            System.out.println(b.get(0));
        }catch(HibernateException ex){
            ex.printStackTrace();
            System.out.println("hibernate exception occured");
        }catch(Exception ex){
            System.out.println((ex.getClass()).getName()+ " exception occured");
        }
        return b;
    }
    
}
