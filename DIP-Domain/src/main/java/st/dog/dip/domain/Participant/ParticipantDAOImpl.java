/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.Participant;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import st.dog.dip.domain.HibernateUtil;

/**
 *
 * @author moneg
 */
public class ParticipantDAOImpl implements ParticipantDAO{

    @Override
    public Participant getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Participant participant = (Participant)session.createCriteria(Participant.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
        session.close();
        return participant;
    }

    @Override
    public Participant getByFname(String fname) {
       Session session = HibernateUtil.getSessionFactory().openSession();
        Participant participant = (Participant)session.createCriteria(Participant.class)
                .add(Restrictions.eq("fname", fname)).uniqueResult();
        session.close();
        return participant;
    }

    @Override
    public Participant getBySname(String sname) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Participant participant = (Participant)session.createCriteria(Participant.class)
                .add(Restrictions.eq("sname", sname)).uniqueResult();
        session.close();
        return participant;
    }

    @Override
    public Participant getByLname(String lname) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Participant participant = (Participant)session.createCriteria(Participant.class)
                .add(Restrictions.eq("lname", lname)).uniqueResult();
        session.close();
        return participant;
    }

    @Override
    public Participant getByAge(int age) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Participant participant = (Participant)session.createCriteria(Participant.class)
                .add(Restrictions.eq("age", age)).uniqueResult();
        session.close();
        return participant;
    }

    @Override
    public List<Participant> getList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Participant.class); 
        List<Participant> participant = (List<Participant>)crit.list();
        session.close();
        return participant;
    }
    
}
