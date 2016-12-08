/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.service.Dogshow;

import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import st.dog.dip.domain.Dogshow.Dogshow;
import st.dog.dip.domain.Dogshow.DogshowDAO;
import st.dog.dip.service.ODEException.ODEException;

/**
 *
 * @author moneg
 */
public class DogshowServiceImpl implements DogshowService{
    @Autowired
    private DogshowDAO dogshowDao;
    
    @Override
    public Dogshow getById(int id) {
         Dogshow dsh = null;
        try{
            dsh = dogshowDao.getById(id);
            if(dsh == null){
                throw new ODEException("such Dogshow is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dogshow does not exist");
            throw ex;
        }
        return dsh;
    }

    @Override
    public Dogshow getByTitle(String title) {
         Dogshow dsh = null;
        try{
            dsh = dogshowDao.getByTitle(title);
            if(dsh == null){
                throw new ODEException("such Dogshow is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dogshow does not exist");
            throw ex;
        }
        return dsh;
    }

    @Override
    public Dogshow getByDate(Date date) {
         Dogshow dsh = null;
        try{
            dsh = dogshowDao.getByDate(date);
            if(dsh == null){
                throw new ODEException("such Dogshow is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dogshow does not exist");
            throw ex;
        }
        return dsh;
    }

    @Override
    public Dogshow getBySponsor(String sponsor) {
         Dogshow dsh = null;
        try{
            dsh = dogshowDao.getBySponsor(sponsor);
            if(dsh == null){
                throw new ODEException("such Dogshow is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dogshow does not exist");
            throw ex;
        }
        return dsh;
    }

    @Override
    public Dogshow getByDescription(String description) {
         Dogshow dsh = null;
        try{
            dsh = dogshowDao.getByDescription(description);
            if(dsh == null){
                throw new ODEException("such Dogshow is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dogshow does not exist");
            throw ex;
        }
        return dsh;
    }

    @Override
    public Dogshow getByAddress(String address) {
         Dogshow dsh = null;
        try{
            dsh = dogshowDao.getByAddress(address);
            if(dsh == null){
                throw new ODEException("such Dogshow is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dogshow does not exist");
            throw ex;
        }
        return dsh;
    }

    @Override
    public Dogshow getByOrganizer(String organizer) {
         Dogshow dsh = null;
        try{
            dsh = dogshowDao.getByOrganizer(organizer);
            if(dsh == null){
                throw new ODEException("such Dogshow is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Dogshow does not exist");
            throw ex;
        }
        return dsh;
    }

    @Override
    public List<Dogshow> getList() {
        List<Dogshow> dsh = null;
        try{
            dsh = dogshowDao.getList();
            System.out.println(dsh.get(0));
        }catch(HibernateException ex){
            ex.printStackTrace();
            System.out.println("hibernate exception occured");
        }catch(Exception ex){
            System.out.println((ex.getClass()).getName()+ " exception occured");
        }
        return dsh;
    }
}
