/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.service.Participant;

import java.util.List;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import st.dog.dip.domain.Participant.Participant;
import st.dog.dip.domain.Participant.ParticipantDAO;
import st.dog.dip.service.ODEException.ODEException;

/**
 *
 * @author moneg
 */
public class ParticipantServiceImpl implements ParticipantService{
     @Autowired
    private ParticipantDAO participantDao;
    
    @Override
    public Participant getById(int id) {
        Participant p = null;
        try{
            p = participantDao.getById(id);
            if(p == null){
                throw new ODEException("such Participant is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Participant does not exist");
            throw ex;
        }
        return p;
    }

    @Override
    public Participant getByFname(String fname) {
        Participant p = null;
        try{
            p = participantDao.getByFname(fname);
            if(p == null){
                throw new ODEException("such Participant is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Participant does not exist");
            throw ex;
        }
        return p;
    }

    @Override
    public Participant getBySname(String sname) {
        Participant p = null;
        try{
            p = participantDao.getBySname(sname);
            if(p == null){
                throw new ODEException("such Participant is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Participant does not exist");
            throw ex;
        }
        return p;
    }

    @Override
    public Participant getByLname(String lname) {
        Participant p = null;
        try{
            p = participantDao.getByLname(lname);
            if(p == null){
                throw new ODEException("such Participant is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Participant does not exist");
            throw ex;
        }
        return p;
    }

    @Override
    public Participant getByAge(int age) {
        Participant p = null;
        try{
            p = participantDao.getByAge(age);
            if(p == null){
                throw new ODEException("such Participant is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Participant does not exist");
            throw ex;
        }
        return p;
    }

    @Override
    public List<Participant> getList() {
        List<Participant> p = null;
        try{
            p = participantDao.getList();
            System.out.println(p.get(0));
        }catch(HibernateException ex){
            ex.printStackTrace();
            System.out.println("hibernate exception occured");
        }catch(Exception ex){
            System.out.println((ex.getClass()).getName()+ " exception occured");
        }
        return p;
    }
}
