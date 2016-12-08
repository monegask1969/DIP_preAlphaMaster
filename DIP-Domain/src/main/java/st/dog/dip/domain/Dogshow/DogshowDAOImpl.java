/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.Dogshow;

import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import st.dog.dip.domain.HibernateUtil;

/**
 *
 * @author moneg
 */
public class DogshowDAOImpl implements DogshowDAO{

    @Override
    public Dogshow getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dogshow dogshow = (Dogshow)session.createCriteria(Dogshow.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
        session.close();
        return dogshow;
    }

    @Override
    public Dogshow getByTitle(String title) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dogshow dogshow = (Dogshow)session.createCriteria(Dogshow.class)
                .add(Restrictions.eq("title", title)).uniqueResult();
        session.close();
        return dogshow;
    }

    @Override
    public Dogshow getByDate(Date date) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dogshow dogshow = (Dogshow)session.createCriteria(Dogshow.class)
                .add(Restrictions.eq("date", date)).uniqueResult();
        session.close();
        return dogshow;
    }

    @Override
    public Dogshow getBySponsor(String sponsor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dogshow dogshow = (Dogshow)session.createCriteria(Dogshow.class)
                .add(Restrictions.eq("sponsor", sponsor)).uniqueResult();
        session.close();
        return dogshow;
    }

    @Override
    public Dogshow getByDescription(String description) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dogshow dogshow = (Dogshow)session.createCriteria(Dogshow.class)
                .add(Restrictions.eq("description", description)).uniqueResult();
        session.close();
        return dogshow;
    }

    @Override
    public Dogshow getByAddress(String address) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dogshow dogshow = (Dogshow)session.createCriteria(Dogshow.class)
                .add(Restrictions.eq("address", address)).uniqueResult();
        session.close();
        return dogshow;
    }

    @Override
    public Dogshow getByOrganizer(String organizer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dogshow dogshow = (Dogshow)session.createCriteria(Dogshow.class)
                .add(Restrictions.eq("organizer", organizer)).uniqueResult();
        session.close();
        return dogshow;
    }

    @Override
    public List<Dogshow> getList() {
       Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Dogshow.class); 
        List<Dogshow> dogshow = (List<Dogshow>)crit.list();
        session.close();
        return dogshow;
    }
    
}
