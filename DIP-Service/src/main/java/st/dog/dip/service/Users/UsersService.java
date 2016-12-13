/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.service.Users;

import st.dog.dip.domain.User.Users;

/**
 *
 * @author moneg
 */
public interface UsersService {
    Users getById(int id);
    Users getByEmail(String email);
    Users getByLogin(String login);
}
