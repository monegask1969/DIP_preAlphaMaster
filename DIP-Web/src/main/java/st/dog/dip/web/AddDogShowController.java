/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.web;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import st.dog.dip.domain.Dog.DogDAO;
import st.dog.dip.domain.Dogshow.Dogshow;
import st.dog.dip.domain.Dogshow.DogshowDAO;

/**
 *
 * @author moneg
 */
@Controller
public class AddDogShowController {
    private DogshowDAO dogshowDAO;
    
     @RequestMapping(value = {"/add_dogshows"}, method = {RequestMethod.GET})
    public ModelAndView addDogShows(){
        ModelAndView mv = new ModelAndView();               
        mv.setViewName("dogs/add_dogshow");
        return mv;
    }
    
    @RequestMapping(value = {"/add_show"}, method = {RequestMethod.GET})
    public ModelAndView addShow(@RequestParam("title") String title, @RequestParam("date") Date date, @RequestParam("sponsor") String sponsor, @RequestParam("description") String description, @RequestParam("address") String address, 
            @RequestParam("organizer") String organizer){
        ModelAndView mv = new ModelAndView();
        Dogshow dogshow = new Dogshow();
        dogshow.setTitle(title);
        dogshow.setDate(date);
        dogshow.setSponsor(sponsor);
        dogshow.setDescription(description);
        dogshow.setAddress(address);
        dogshow.setOrganizer(organizer);
        dogshowDAO.addDogShow(dogshow);
        mv.setViewName("dogs/finished");
        return mv;
    }
}
