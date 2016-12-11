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
        DogshowService dogShowService;
    
     @RequestMapping(value = {"/dogshow"}, method = {RequestMethod.GET})
    public ModelAndView getHomePage(){
        System.out.println("DOGSHOW");
        List<Dogshow> dList = dogShowService.getList();
        System.out.println(dList);
        ModelAndView mv = new ModelAndView();
        mv.addObject("dogshow", dList);
        mv.setViewName("dogs/dogshows");
        return mv;
    }
}
