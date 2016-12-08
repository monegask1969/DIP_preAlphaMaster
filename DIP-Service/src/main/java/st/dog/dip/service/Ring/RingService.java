/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.service.Ring;

import java.util.List;
import st.dog.dip.domain.Ring.Ring;

/**
 *
 * @author moneg
 */
public interface RingService {
    Ring getById(int id);
    Ring getByDogShow(int dogshow_id);
    Ring getByTitle(String title);
    List<Ring> getList();
}
