/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.dog.dip.web.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 *
 * @author moneg
 */
@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter{
    @Override
	protected void configure(HttpSecurity http) throws Exception {
                http.csrf().disable();
		http.authorizeRequests()
//				.antMatchers("/*").access("hasRole('ADMIN')")
				.antMatchers("/*").permitAll()
				.and().formLogin()
                        .defaultSuccessUrl("/home_page", false);

	}
}
