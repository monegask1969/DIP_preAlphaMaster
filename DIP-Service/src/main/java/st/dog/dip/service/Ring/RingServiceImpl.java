/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.service.Ring;

import java.util.List;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import st.dog.dip.domain.Ring.Ring;
import st.dog.dip.domain.Ring.RingDAO;
import st.dog.dip.service.ODEException.ODEException;

/**
 *
 * @author moneg
 */
public class RingServiceImpl implements RingService{
    @Autowired
    private RingDAO ringDao;
    
    @Override
    public Ring getById(int id) {
        Ring r = null;
        try{
            r = ringDao.getById(id);
            if(r == null){
                throw new ODEException("such Ring is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Ring does not exist");
            throw ex;
        }
        return r;
    }

    @Override
    public Ring getByDogShow(int dogshow_id) {
        Ring r = null;
        try{
            r = ringDao.getByDogShow(dogshow_id);
            if(r == null){
                throw new ODEException("such Ring is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Ring does not exist");
            throw ex;
        }
        return r;
    }

    @Override
    public List<Ring> getList() {
        List<Ring> r = null;
        try{
            r = ringDao.getList();
            System.out.println(r.get(0));
        }catch(HibernateException ex){
            ex.printStackTrace();
            System.out.println("hibernate exception occured");
        }catch(Exception ex){
            System.out.println((ex.getClass()).getName()+ " exception occured");
        }
        return r;
    }

    @Override
    public Ring getByTitle(String title) {
        Ring r = null;
        try{
            r = ringDao.getByTitle(title);
            if(r == null){
                throw new ODEException("such Ring is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Ring does not exist");
            throw ex;
        }
        return r;
    }
}
