/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import st.dog.dip.domain.Dogshow.Dogshow;
import st.dog.dip.service.Dogshow.DogshowService;


/**
 *
 * @author moneg
 */
@Controller
public class DogShowPageController {
    @Autowired
        DogshowService dogshowService;
    
  @RequestMapping(value = {"/dogshows"}, method = {RequestMethod.GET})
    public ModelAndView getDogShows(){
        ModelAndView mv = new ModelAndView();        
        List<Dogshow> dList = dogshowService.getList();
        System.out.println("DOGSHOW");
        System.out.println(dList);        
        mv.setViewName("dogs/dogshows");
        mv.addObject("dogshows", dList);
        return mv;
    }
    
   
}
