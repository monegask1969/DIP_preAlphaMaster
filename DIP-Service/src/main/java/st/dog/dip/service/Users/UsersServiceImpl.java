/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.service.Users;

import org.springframework.beans.factory.annotation.Autowired;
import st.dog.dip.domain.User.Users;
import st.dog.dip.domain.User.UsersDAO;
import st.dog.dip.service.ODEException.ODEException;



/**
 *
 * @author moneg
 */
public class UsersServiceImpl implements UsersService{
    
     @Autowired
     private UsersDAO usersDAO;

    @Override
    public Users getById(int id) {
        Users u = null;
        try{
            u = usersDAO.getById(id);
            if(u == null){
                throw new ODEException("such Breeder is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Breeder does not exist");
            throw ex;
        }
        return u;
    }

    @Override
    public Users getByEmail(String email) {
        Users u = null;
        try{
            u = usersDAO.getByEmail(email);
            if(u == null){
                throw new ODEException("such Breeder is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Breeder does not exist");
            throw ex;
        }
        return u;
    }

    @Override
    public Users getByLogin(String login) {
        Users u = null;
        try{
            u = usersDAO.getByLogin(login);
            if(u == null){
                throw new ODEException("such Breeder is not exist");
            }
        }catch(ODEException ex){
            System.out.println("write log - Breeder does not exist");
            throw ex;
        }
        return u;
    }
    
}
