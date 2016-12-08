/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.Breeder;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import st.dog.dip.domain.Dog.Dog;
import st.dog.dip.domain.HibernateUtil;

/**
 *
 * @author moneg
 */
public class BreederDAOImpl implements BreederDAO{

    @Override
    public Breeder getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Breeder breeder = (Breeder)session.createCriteria(Breeder.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
        session.close();
        return breeder;
    }

    @Override
    public Breeder getByFname(String fname) {
       Session session = HibernateUtil.getSessionFactory().openSession();
        Breeder breeder = (Breeder)session.createCriteria(Breeder.class)
                .add(Restrictions.eq("fname", fname)).uniqueResult();
        session.close();
        return breeder;
    }

    @Override
    public Breeder getBySname(String sname) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Breeder breeder = (Breeder)session.createCriteria(Breeder.class)
                .add(Restrictions.eq("sname", sname)).uniqueResult();
        session.close();
        return breeder;
    }

    @Override
    public Breeder getByLname(String lname) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Breeder breeder = (Breeder)session.createCriteria(Breeder.class)
                .add(Restrictions.eq("lname", lname)).uniqueResult();
        session.close();
        return breeder;
    }

    @Override
    public Breeder getByDog(Dog dog) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Breeder breeder = (Breeder)session.createCriteria(Breeder.class)
                .add(Restrictions.eq("dog", dog)).uniqueResult();
        session.close();
        return breeder;
    }
    
    @Override
    public List<Breeder> getList(){
     Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Breeder.class); 
        List<Breeder> breeder = (List<Breeder>)crit.list();
        session.close();
        return breeder;
    }
    
}
