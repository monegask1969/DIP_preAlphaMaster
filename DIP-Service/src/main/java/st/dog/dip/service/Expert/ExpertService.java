/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.service.Expert;

import java.util.List;
import st.dog.dip.domain.Expert.Expert;

/**
 *
 * @author moneg
 */
public interface ExpertService {
    Expert getById(int id);
    Expert getByFname(String fname);
    Expert getBySname(String sname);
    Expert getByLname(String lname);
    Expert getByCountry(String country);
    Expert getByDescription(String description);
    List<Expert> getList();
}
