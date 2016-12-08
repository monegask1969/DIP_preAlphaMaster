/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.Contest;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import st.dog.dip.domain.HibernateUtil;

/**
 *
 * @author moneg
 */
public class ContestDAOImpl implements ContestDAO{

    @Override
    public Contest getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Contest contest = (Contest)session.createCriteria(Contest.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
        session.close();
        return contest;
    }

    @Override
    public Contest getByTitle(String title) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Contest contest = (Contest)session.createCriteria(Contest.class)
                .add(Restrictions.eq("title", title)).uniqueResult();
        session.close();
        return contest;
    }

    @Override
    public Contest getByDescription(String description) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Contest contest = (Contest)session.createCriteria(Contest.class)
                .add(Restrictions.eq("description", description)).uniqueResult();
        session.close();
        return contest;
    }

    @Override
    public Contest getByForWhom(int for_whom) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Contest contest = (Contest)session.createCriteria(Contest.class)
                .add(Restrictions.eq("for_whom", for_whom)).uniqueResult();
        session.close();
        return contest;
    }

    @Override
    public List<Contest> getList() {
         Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Contest.class); 
        List<Contest> contest = (List<Contest>)crit.list();
        session.close();
        return contest;
    }
    
}
