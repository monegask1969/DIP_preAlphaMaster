/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.service.Contest;

import java.util.List;
import st.dog.dip.domain.Contest.Contest;

/**
 *
 * @author moneg
 */
public interface ContestService {
    Contest getById(int id);
    Contest getByTitle(String title);
    Contest getByDescription(String description);
    Contest getByForWhom(int for_whom);
    List<Contest> getList();
}
