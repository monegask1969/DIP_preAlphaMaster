/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.Dogshow;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java.sql.PreparedStatement;
import java.sql.SQLException;
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

    private Connection connection;
    
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
        List<Dogshow> dogshows = (List<Dogshow>)crit.list();
        session.close();
        return dogshows;
    }

    @Override
    public void addDogShow(Dogshow dogshow) {
        try{
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into dogshow(title,date,sponsor,description,address,organizer) values (?,?,?,?,?,?");
            preparedStatement.setString(1, dogshow.getTitle());
            preparedStatement.setDate(2, new java.sql.Date(dogshow.getDate().getTime()));
            preparedStatement.setString(3, dogshow.getSponsor());
            preparedStatement.setString(4, dogshow.getDescription());
            preparedStatement.setString(5, dogshow.getAddress());
            preparedStatement.setString(6, dogshow.getOrganizer());
            preparedStatement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteDogShow(int dogshowId) {
        try{
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from dogshow where userid=?");
            preparedStatement.setInt(1, dogshowId);
            preparedStatement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateDogShow(Dogshow dogshow) {
        try{
        PreparedStatement preparedStatement = connection
                    .prepareStatement("update dogshow set title=?, date=?, sponsor=?, description=?, address=?, organizer=?" +
                            "where id=?");
        preparedStatement.setString(1, dogshow.getTitle());
            preparedStatement.setDate(2, new java.sql.Date(dogshow.getDate().getTime()));
            preparedStatement.setString(3, dogshow.getSponsor());
            preparedStatement.setString(4, dogshow.getDescription());
            preparedStatement.setString(5, dogshow.getAddress());
            preparedStatement.setString(6, dogshow.getOrganizer());
            preparedStatement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

}
