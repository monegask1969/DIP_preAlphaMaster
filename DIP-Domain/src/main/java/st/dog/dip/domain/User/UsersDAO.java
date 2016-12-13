/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.User;

/**
 *
 * @author moneg
 */
public interface UsersDAO {
    Users getById(int id);
    Users getByEmail(String email);
    Users getByLogin(String login);
}
