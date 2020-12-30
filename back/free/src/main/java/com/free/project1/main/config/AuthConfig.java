package com.free.project1.main.config;

import com.free.project1.main.services.usuario.ServicioUsuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// @Configuration
// @EnableWebSecurity
public class AuthConfig 
// extends WebSecurityConfigurerAdapter 
{
    
    // @Autowired
    // private UserService userDetailsService;

    // @Autowired
    // private BCryptPasswordEncoder bcrypt;

    // public static enum USER_ROLES {
    //     ROOT, ADMIN, GENERAL
    // }

    // @Bean
    // public BCryptPasswordEncoder passwordEncoder() {
    //     BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    //     return encoder;
    // }

    // @Override
    // protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    //     auth.userDetailsService(userDetailsService).passwordEncoder(bcrypt);
    //     super.configure(auth);
    // }
}
