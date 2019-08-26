package com.example.sec.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author Mutlu
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    //Spring Boot Basic Authentication
	
    private static final String USER = "USER";
    private static final String ADMIN = "ADMIN";
    
    
    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeRequests().antMatchers("/**").hasRole(ADMIN).and().formLogin();
    }
    
    
    @Autowired
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
     
        auth.inMemoryAuthentication()
                .withUser("mutlu").password("{noop}mutlu123").roles(USER)
                .and()
                .withUser("admin").password("{noop}admin123").roles(ADMIN);

    }
    
}

