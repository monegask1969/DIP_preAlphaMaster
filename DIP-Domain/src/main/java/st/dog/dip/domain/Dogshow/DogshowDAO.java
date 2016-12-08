/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.Dogshow;

import java.util.Date;
import java.util.List;

/**
 *
 * @author moneg
 */
public interface DogshowDAO {
    Dogshow getById(int id);
    Dogshow getByTitle(String title);
    Dogshow getByDate(Date date);
    Dogshow getBySponsor(String sponsor);
    Dogshow getByDescription(String description);
    Dogshow getByAddress(String address);
    Dogshow getByOrganizer(String organizer);
    List<Dogshow> getList();
}
