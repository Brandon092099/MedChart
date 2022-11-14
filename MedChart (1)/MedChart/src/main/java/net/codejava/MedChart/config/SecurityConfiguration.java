/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.config;

import net.codejava.MedChart.Service.User_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


/**
 *
 * @author amaya
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    
    @Autowired
    private User_Service userService;
    
    @Autowired
    private CustomLoginSuccessHandler successHandler;

    
    @Lazy
    @Bean
    public BCryptPasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
        auth.setUserDetailsService(userService);
        auth.setPasswordEncoder(encoder());
        return auth;
    }
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth)throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }

    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(
                "/SignUp**",
                "/js/**",
                "/css/**",
                "/img/**").permitAll()
                .antMatchers("/admin/**").hasAuthority("Admin")
                .antMatchers("/medStaff/**").hasAuthority("Medical Staff")
                .antMatchers("/receptionist/**").hasAuthority("Receptionist")
                .antMatchers("/patient/**").hasAuthority("Patient")
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/Login")
                .successHandler(successHandler)
                .permitAll()
                .and().logout().invalidateHttpSession(true)
                .clearAuthentication(true)
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/Login?logout").permitAll();

    }

}
