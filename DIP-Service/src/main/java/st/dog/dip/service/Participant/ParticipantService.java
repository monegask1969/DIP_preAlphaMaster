/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.service.Participant;

import java.util.List;
import st.dog.dip.domain.Participant.Participant;

/**
 *
 * @author moneg
 */
public interface ParticipantService {
    Participant getById(int id);
    Participant getByFname(String fname);
    Participant getBySname(String sname);
    Participant getByLname(String lname);
    Participant getByAge(int age);
    List<Participant> getList();
}
