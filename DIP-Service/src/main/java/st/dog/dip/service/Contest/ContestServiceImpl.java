/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.service.Contest;

import java.util.List;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import st.dog.dip.domain.Contest.Contest;
import st.dog.dip.domain.Contest.ContestDAO;
import st.dog.dip.service.ODEException.ODEException;

/**
 *
 * @author moneg
 */
public class ContestServiceImpl implements ContestService{

    @Autowired
    private ContestDAO contestDao;
    
    @Override
    public Contest getById(int id) {
         Contest c = null;
        try{
            c = contestDao.getById(id);
            if(c == null){
                throw new ODEException("such Contest is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Contest does not exist");
            throw ex;
        }
        return c;
    }

    @Override
    public Contest getByTitle(String title) {
        Contest c = null;
        try{
            c = contestDao.getByTitle(title);
            if(c == null){
                throw new ODEException("such Contest is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Contest does not exist");
            throw ex;
        }
        return c;
    }

    @Override
    public Contest getByDescription(String description) {
        Contest c = null;
        try{
            c = contestDao.getByDescription(description);
            if(c == null){
                throw new ODEException("such Contest is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Contest does not exist");
            throw ex;
        }
        return c;
    }

    @Override
    public Contest getByForWhom(int for_whom) {
        Contest c = null;
        try{
            c = contestDao.getByForWhom(for_whom);
            if(c == null){
                throw new ODEException("such Contest is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Contest does not exist");
            throw ex;
        }
        return c;
    }

    @Override
    public List<Contest> getList() {
         List<Contest> c = null;
        try{
            c = contestDao.getList();
            System.out.println(c.get(0));
        }catch(HibernateException ex){
            ex.printStackTrace();
            System.out.println("hibernate exception occured");
        }catch(Exception ex){
            System.out.println((ex.getClass()).getName()+ " exception occured");
        }
        return c;
    }
    
}
