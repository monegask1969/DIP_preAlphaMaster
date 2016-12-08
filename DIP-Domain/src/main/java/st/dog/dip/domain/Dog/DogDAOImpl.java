/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.Dog;

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
public class DogDAOImpl implements DogDAO{

   @Override
    public Dog getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dog dog = (Dog)session.createCriteria(Dog.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dog getByBreed(String breed) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dog dog = (Dog)session.createCriteria(Dog.class)
                .add(Restrictions.eq("breed", breed)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dog getByGender(String gender) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dog dog = (Dog)session.createCriteria(Dog.class)
                .add(Restrictions.eq("gender", gender)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dog getByName(String name) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dog dog = (Dog)session.createCriteria(Dog.class)
                .add(Restrictions.eq("name", name)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dog getByDob(Date dob) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dog dog = (Dog)session.createCriteria(Dog.class)
                .add(Restrictions.eq("dob", dob)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dog getByColor(String color) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dog dog = (Dog)session.createCriteria(Dog.class)
                .add(Restrictions.eq("color", color)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dog getByChip(String chip) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dog dog = (Dog)session.createCriteria(Dog.class)
                .add(Restrictions.eq("chip", chip)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dog getByBrand(String brand) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dog dog = (Dog)session.createCriteria(Dog.class)
                .add(Restrictions.eq("brand", brand)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dog getByPedigree(String pedigree) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dog dog = (Dog)session.createCriteria(Dog.class)
                .add(Restrictions.eq("pedigree", pedigree)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dog getBySire(String sire) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dog dog = (Dog)session.createCriteria(Dog.class)
                .add(Restrictions.eq("sire", sire)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dog getByDam(String dam) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dog dog = (Dog)session.createCriteria(Dog.class)
                .add(Restrictions.eq("dam", dam)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dog getByFciGroup(int fcigroup) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dog dog = (Dog)session.createCriteria(Dog.class)
                .add(Restrictions.eq("fcigroup", fcigroup)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dog getByOwnerId(int ownerid) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dog dog = (Dog)session.createCriteria(Dog.class)
                .add(Restrictions.eq("ownerid", ownerid)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public Dog getByBreederId(int breederid) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Dog dog = (Dog)session.createCriteria(Dog.class)
                .add(Restrictions.eq("breederid", breederid)).uniqueResult();
        session.close();
        return dog;
    }

    @Override
    public List<Dog> getList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Dog.class); 
        List<Dog> dog = (List<Dog>)crit.list();
        session.close();
        return dog;
    }
    
}
