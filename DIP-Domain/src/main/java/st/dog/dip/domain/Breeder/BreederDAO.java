/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.Breeder;

import java.util.List;
import st.dog.dip.domain.Dog.Dog;

/**
 *
 * @author moneg
 */
public interface BreederDAO {
    Breeder getById(int id);
    Breeder getByFname(String fname);
    Breeder getBySname(String sname);
    Breeder getByLname(String lname);
    Breeder getByDog(Dog dog);
    List<Breeder> getList();
}
