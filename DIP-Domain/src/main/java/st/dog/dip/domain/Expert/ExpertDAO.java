/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.Expert;

import java.util.List;

/**
 *
 * @author moneg
 */
public interface ExpertDAO {
    Expert getById(int id);
    Expert getByFname(String fname);
    Expert getBySname(String sname);
    Expert getByLname(String lname);
    Expert getByCountry(String country);
    Expert getByDescription(String description);
    List<Expert> getList();
}
