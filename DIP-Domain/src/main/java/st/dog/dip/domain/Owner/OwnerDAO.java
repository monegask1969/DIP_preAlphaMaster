/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.Owner;

import java.util.List;

/**
 *
 * @author moneg
 */
public interface OwnerDAO {
    Owner getById(int id);
    Owner getByFname(String fname);
    Owner getBySname(String sname);
    Owner getByLname(String lname);
    Owner getByLocation(String location);
    List<Owner> getList();
}
