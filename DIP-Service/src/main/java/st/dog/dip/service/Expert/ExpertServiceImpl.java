/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.service.Expert;

import java.util.List;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import st.dog.dip.domain.Expert.Expert;
import st.dog.dip.domain.Expert.ExpertDAO;
import st.dog.dip.service.ODEException.ODEException;

/**
 *
 * @author moneg
 */
public class ExpertServiceImpl implements ExpertService{
      @Autowired
    private ExpertDAO expertDao;
    
    @Override
    public Expert getById(int id) {
        Expert e = null;
        try{
            e = expertDao.getById(id);
            if(e == null){
                throw new ODEException("such Expert is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Expert does not exist");
            throw ex;
        }
        return e;
    }

    @Override
    public Expert getByFname(String fname) {
        Expert e = null;
        try{
            e = expertDao.getByFname(fname);
            if(e == null){
                throw new ODEException("such Expert is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Expert does not exist");
            throw ex;
        }
        return e;
    }

    @Override
    public Expert getBySname(String sname) {
        Expert e = null;
        try{
            e = expertDao.getBySname(sname);
            if(e == null){
                throw new ODEException("such Expert is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Expert does not exist");
            throw ex;
        }
        return e;
    }

    @Override
    public Expert getByLname(String lname) {
        Expert e = null;
        try{
            e = expertDao.getByLname(lname);
            if(e == null){
                throw new ODEException("such Expert is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Expert does not exist");
            throw ex;
        }
        return e;
    }

    @Override
    public Expert getByCountry(String country) {
        Expert e = null;
        try{
            e = expertDao.getByCountry(country);
            if(e == null){
                throw new ODEException("such Expert is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Expert does not exist");
            throw ex;
        }
        return e;
    }

    @Override
    public Expert getByDescription(String description) {
        Expert e = null;
        try{
            e = expertDao.getByDescription(description);
            if(e == null){
                throw new ODEException("such Expert is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Expert does not exist");
            throw ex;
        }
        return e;
    }

    @Override
    public List<Expert> getList() {
        List<Expert> e = null;
        try{
            e = expertDao.getList();
            System.out.println(e.get(0));
        }catch(HibernateException ex){
            ex.printStackTrace();
            System.out.println("hibernate exception occured");
        }catch(Exception ex){
            System.out.println((ex.getClass()).getName()+ " exception occured");
        }
        return e;
    }
}
