/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.service.Owner;

import java.util.List;
import st.dog.dip.domain.Owner.Owner;

/**
 *
 * @author moneg
 */
public interface OwnerService {
    Owner getById(int id);
    Owner getByFname(String fname);
    Owner getBySname(String sname);
    Owner getByLname(String lname);
    Owner getByLocation(String location);
    List<Owner> getList();
}
