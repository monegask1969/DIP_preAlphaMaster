/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.service.Dogshow;

import java.util.Date;
import java.util.List;
import st.dog.dip.domain.Dogshow.Dogshow;

/**
 *
 * @author moneg
 */
public interface DogshowService {
    Dogshow getById(int id);
    Dogshow getByTitle(String title);
    Dogshow getByDate(Date date);
    Dogshow getBySponsor(String sponsor);
    Dogshow getByDescription(String description);
    Dogshow getByAddress(String address);
    Dogshow getByOrganizer(String organizer);
    List<Dogshow> getList();
}
