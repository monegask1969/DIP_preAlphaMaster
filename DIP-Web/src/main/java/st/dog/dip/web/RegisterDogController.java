/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.web;

import static com.sun.org.apache.xpath.internal.axes.HasPositionalPredChecker.check;
import javax.enterprise.inject.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import st.dog.dip.domain.Dog.Dog;
import st.dog.dip.service.Dog.DogService;

/**
 *
 * @author moneg
 */
@Controller
public class RegisterDogController {
    @Autowired
    private DogService dogService;
    
    @RequestMapping(value = {"/register_dog"}, method = {RequestMethod.GET})
    public ModelAndView getHomePage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("dogs/register_dog");
        return mv;
    }

//    @PostMapping("/addDog")
//    public ModelAndView dogSubmit(@RequestParam Dog dog) {
//                ModelAndView model = new ModelAndView();
//                dogService.
//                model.addObject("dog", dog);
//                return model;
//    }
    
}
