/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.domain.Contest;

import java.util.List;

/**
 *
 * @author moneg
 */
public interface ContestDAO {
    Contest getById(int id);
    Contest getByTitle(String title);
    Contest getByDescription(String description);
    Contest getByForWhom(int for_whom);
    List<Contest> getList();
}
