/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author moneg
 */
@Controller
public class RegisterParticipantController {
     @RequestMapping(value = {"/register_participant"}, method = {RequestMethod.GET})
    public ModelAndView getHomePage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("dogs/register_participant");
        return mv;
    }
}
