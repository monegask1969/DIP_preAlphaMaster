/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.Ring;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import st.dog.dip.domain.HibernateUtil;

/**
 *
 * @author moneg
 */
public class RingDAOImpl implements RingDAO{

    @Override
    public Ring getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Ring ring = (Ring)session.createCriteria(Ring.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
        session.close();
        return ring;
    }

    @Override
    public Ring getByDogShow(int dogshow_id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Ring ring = (Ring)session.createCriteria(Ring.class)
                .add(Restrictions.eq("dogshow_id", dogshow_id)).uniqueResult();
        session.close();
        return ring;
    }

    @Override
    public List<Ring> getList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Ring.class); 
        List<Ring> ring = (List<Ring>)crit.list();
        session.close();
        return ring;
    }

    @Override
    public Ring getByTitle(String title) {
       Session session = HibernateUtil.getSessionFactory().openSession();
        Ring ring = (Ring)session.createCriteria(Ring.class)
                .add(Restrictions.eq("title", title)).uniqueResult();
        session.close();
        return ring;
    }
    
}
