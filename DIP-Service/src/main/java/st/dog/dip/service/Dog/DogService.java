/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.service.Dog;

import java.util.Date;
import java.util.List;
import st.dog.dip.domain.Dog.Dog;

/**
 *
 * @author moneg
 */
public interface DogService {
    Dog getById(int id);
    Dog getByBreed(String breed);
    Dog getByGender(String gender);
    Dog getByName(String name);
    Dog getByDob(Date dob);
    Dog getByColor(String color);
    Dog getByChip(String chip);
    Dog getByBrand(String brand);
    Dog getByPedigree(String pedigree);
    Dog getBySire(String sire);
    Dog getByDam(String dam);
    Dog getByFciGroup(int fcigroup);
    Dog getByOwnerId(int ownerid);
    Dog getByBreederId(int breederid);
    List<Dog> getList();
}
