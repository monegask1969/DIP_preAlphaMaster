/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.User;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import st.dog.dip.domain.HibernateUtil;

/**
 *
 * @author moneg
 */
public class UsersDAOImpl implements UsersDAO{

    @Override
    public Users getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Users users = (Users)session.createCriteria(Users.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
        session.close();
        return users;
    }

    @Override
    public Users getByEmail(String email) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Users users = (Users)session.createCriteria(Users.class)
                .add(Restrictions.eq("email", email)).uniqueResult();
        session.close();
        return users;
    }

    @Override
    public Users getByLogin(String login) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Users users = (Users)session.createCriteria(Users.class)
                .add(Restrictions.eq("login", login)).uniqueResult();
        session.close();
        return users;
    }
    
}
