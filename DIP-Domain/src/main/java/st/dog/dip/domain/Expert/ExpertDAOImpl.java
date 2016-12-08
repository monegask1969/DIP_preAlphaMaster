/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.Expert;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import st.dog.dip.domain.HibernateUtil;

/**
 *
 * @author moneg
 */
public class ExpertDAOImpl implements ExpertDAO{

    @Override
    public Expert getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Expert expert = (Expert)session.createCriteria(Expert.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
        session.close();
        return expert;
    }

    @Override
    public Expert getByFname(String fname) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Expert expert = (Expert)session.createCriteria(Expert.class)
                .add(Restrictions.eq("fname", fname)).uniqueResult();
        session.close();
        return expert;
    }

    @Override
    public Expert getBySname(String sname) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Expert expert = (Expert)session.createCriteria(Expert.class)
                .add(Restrictions.eq("sname", sname)).uniqueResult();
        session.close();
        return expert;
    }

    @Override
    public Expert getByLname(String lname) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Expert expert = (Expert)session.createCriteria(Expert.class)
                .add(Restrictions.eq("lname", lname)).uniqueResult();
        session.close();
        return expert;
    }

    @Override
    public Expert getByCountry(String country) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Expert expert = (Expert)session.createCriteria(Expert.class)
                .add(Restrictions.eq("country", country)).uniqueResult();
        session.close();
        return expert;
    }

    @Override
    public Expert getByDescription(String description) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Expert expert = (Expert)session.createCriteria(Expert.class)
                .add(Restrictions.eq("description", description)).uniqueResult();
        session.close();
        return expert;
    }

    @Override
    public List<Expert> getList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Expert.class); 
        List<Expert> expert = (List<Expert>)crit.list();
        session.close();
        return expert;
    }
    
}
