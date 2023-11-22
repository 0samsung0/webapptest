package com.example.practisewithoutsequrity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@Configuration
//public class SecurityConfig {
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//}
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .authorizeRequests()
                .antMatchers("/user/**").hasRole("USER")
                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .httpBasic();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{

        auth
                .inMemoryAuthentication()
                .withUser("user").password("{noop}password").roles("USER")
                .and()
                .withUser("admin").password("{noop}password").roles("ADMIN");
        //User
           //login
              //work
                 //my-profile
                    ///-{function-1}
                 //my-drives
                    ///-{function-2}
                 //choose-drive
                    ///-{function-3}
           //registration
              //login

        //Admin
           //login
              //work-for-admin
                 //work-with-users
                    ///-{function-4}
                 //work-with-ride
                    ///-{function-5}
                 //work-with-car
                    ///-{function-6}
                 //my-profile
                    ///-{function-7}

        //function-1: 1)edit_name 2)edit_login 3)edit_phone 4)edit_login 5)edit_wallpaper

        //function-2: 1)sort_by_date 2)watch_who_with_you 3)watch_tasks 4)after_start_can_choose_which_task_is_complete

        //function-3: 1)sort_by_a-z 2)sort_by_date 3)sort_by_only_my 4)filter_by_date 5)watch_tasks


        //function-4: 1)sort_by_a-z 2)sort_by_name 3)watch_profile 4)watch_which_now_drive 5)history

        //function-5: 1)sort_by_a-z 2)sort_by_date 3)get_ride_to_user(by_id) 4)filter_by_date 5)watch_tasks 6)add_task_to_ride 7)get_cat_to_ride

        //function-6: 1)sort_by_a-z 2)s 3)watch_which_free 4)add_car

        //function-7: 1)edit_name 2)edit_login 3)edit_phone 4)edit_login 5)edit_wallpaper
    }
}
