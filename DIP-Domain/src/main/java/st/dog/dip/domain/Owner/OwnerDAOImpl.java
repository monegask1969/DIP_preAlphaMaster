/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.Owner;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import st.dog.dip.domain.HibernateUtil;

/**
 *
 * @author moneg
 */
public class OwnerDAOImpl implements OwnerDAO{

    @Override
    public Owner getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Owner owner = (Owner)session.createCriteria(Owner.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
        session.close();
        return owner;
    }

    @Override
    public Owner getByFname(String fname) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Owner owner = (Owner)session.createCriteria(Owner.class)
                .add(Restrictions.eq("fname", fname)).uniqueResult();
        session.close();
        return owner;
    }

    @Override
    public Owner getBySname(String sname) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Owner owner = (Owner)session.createCriteria(Owner.class)
                .add(Restrictions.eq("sname", sname)).uniqueResult();
        session.close();
        return owner;
    }

    @Override
    public Owner getByLname(String lname) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Owner owner = (Owner)session.createCriteria(Owner.class)
                .add(Restrictions.eq("lname", lname)).uniqueResult();
        session.close();
        return owner;
    }

    @Override
    public Owner getByLocation(String location) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Owner owner = (Owner)session.createCriteria(Owner.class)
                .add(Restrictions.eq("location", location)).uniqueResult();
        session.close();
        return owner;
    }

    @Override
    public List<Owner> getList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Owner.class); 
        List<Owner> owner = (List<Owner>)crit.list();
        session.close();
        return owner;
    }
    
}
