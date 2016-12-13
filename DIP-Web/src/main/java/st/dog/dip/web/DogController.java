/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.web;

import java.util.List;
import javax.enterprise.inject.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import st.dog.dip.domain.Breeder.Breeder;
import st.dog.dip.domain.Dog.Dog;
import st.dog.dip.service.Breeder.BreederService;
import st.dog.dip.service.Dog.DogService;

/**
 *
 * @author moneg
 */
@Controller
public class DogController {
//    @Autowired
//    BreederService breederService;
    
    @Autowired(required = true)
    private DogService dogService;

    
    @RequestMapping(value = {"/dogs"}, method = {RequestMethod.GET})
    public ModelAndView getDogPage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("dogs/dogsdet");
        return mv;
    }
    
//    @RequestMapping(value = "/addog", method = RequestMethod.POST)
//public String addPayment(@ModelAttribute("payment") Dog dog) {
//    paymentService.addPayment(dog);
//    return "redirect:payments";
//}
    
//     @RequestMapping(value = {"/breeder"}, method = {RequestMethod.GET})
//    public ModelAndView getDogShows(){
//        ModelAndView mv = new ModelAndView();        
//        List<Breeder> dList = breederService.getList();
//        System.out.println("DOGSHOW");
//        System.out.println(dList);        
//        mv.setViewName("dogs/dogsdet");
//        mv.addObject("breeder", dList);
//        return mv;
//    }
//    @RequestMapping(value="/dogs", method=RequestMethod.POST)
//    public String dogSubmit(@ModelAttribute Dog dog, Model model) {
//        model.addAttribute("dog", dog);
//        return "result";
//    }
}
