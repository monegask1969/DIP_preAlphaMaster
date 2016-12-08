/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.web.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author moneg
 */
@Configuration
@ComponentScan({
"st.dog.dip.domain",
        "st.dog.dip.domain.Breeder",
        "st.dog.dip.domain.Contest",
        "st.dog.dip.domain.Dog",
        "st.dog.dip.domain.Dogshow",
        "st.dog.dip.domain.Expert",
        "st.dog.dip.domain.Owner",
        "st.dog.dip.domain.Participant",
        "st.dog.dip.domain.Ring",
        "st.dog.dip.domain.Config",
        "st.dog.dip.service.Breeder",
        "st.dog.dip.service.Config",
        "st.dog.dip.service.Contest",
        "st.dog.dip.service.Dog",
        "st.dog.dip.service.Dogshow",
        "st.dog.dip.service.Expert",
        "st.dog.dip.service.Owner",
        "st.dog.dip.service.Participant",
        "st.dog.dip.service.Ring"
})
@EnableWebMvc
public class MidtierDispatcherConfig extends WebMvcConfigurerAdapter{
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
            .addResourceHandler("/layout/*/**")    //где находятся
            .addResourceLocations("/layout/")
        ;
    }
}
