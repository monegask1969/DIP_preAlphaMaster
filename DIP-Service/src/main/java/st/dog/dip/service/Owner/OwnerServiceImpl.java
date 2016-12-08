/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.service.Owner;

import java.util.List;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import st.dog.dip.domain.Owner.Owner;
import st.dog.dip.domain.Owner.OwnerDAO;
import st.dog.dip.service.ODEException.ODEException;

/**
 *
 * @author moneg
 */
public class OwnerServiceImpl implements OwnerService{
    
             @Autowired
    private OwnerDAO ownerDao;
    
    @Override
    public Owner getById(int id) {
         Owner o = null;
        try{
            o = ownerDao.getById(id);
            if(o == null){
                throw new ODEException("such Owner is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Owner does not exist");
            throw ex;
        }
        return o;
    }

    @Override
    public Owner getByFname(String fname) {
        Owner o = null;
        try{
            o = ownerDao.getByFname(fname);
            if(o == null){
                throw new ODEException("such Owner is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Owner does not exist");
            throw ex;
        }
        return o;
    }

    @Override
    public Owner getBySname(String sname) {
        Owner o = null;
        try{
            o = ownerDao.getBySname(sname);
            if(o == null){
                throw new ODEException("such Owner is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Owner does not exist");
            throw ex;
        }
        return o;
    }

    @Override
    public Owner getByLname(String lname) {
        Owner o = null;
        try{
            o = ownerDao.getByLname(lname);
            if(o == null){
                throw new ODEException("such Owner is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Owner does not exist");
            throw ex;
        }
        return o;
    }

    @Override
    public Owner getByLocation(String location) {
        Owner o = null;
        try{
            o = ownerDao.getByLocation(location);
            if(o == null){
                throw new ODEException("such Owner is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Owner does not exist");
            throw ex;
        }
        return o;
    }

    @Override
    public List<Owner> getList() {
        List<Owner> o = null;
        try{
            o = ownerDao.getList();
            System.out.println(o.get(0));
        }catch(HibernateException ex){
            ex.printStackTrace();
            System.out.println("hibernate exception occured");
        }catch(Exception ex){
            System.out.println((ex.getClass()).getName()+ " exception occured");
        }
        return o;
    }
}
