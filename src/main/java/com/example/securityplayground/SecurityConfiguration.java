package com.example.securityplayground;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("ahmed")
                .password(getPasswordEncode().encode("ahmed"))
                .roles("USER")
                .and()
                .withUser("mido")
                .password(getPasswordEncode().encode("mido"))
                .roles("USER");
    }


    @Bean
    public PasswordEncoder getPasswordEncode(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

}
