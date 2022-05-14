package pe.isil.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Bean
    @Override
    public UserDetailsService userDetailsServiceBean() throws Exception {

        UserDetails user1 = User.builder()
                .username("jose")
                .password("{noop}123456")
                .roles("Admin")
                .build();

        UserDetails user2 = User.builder()
                .username("maria")
                .password("{noop}abc123")
                .roles("User")
                .build();


        return new InMemoryUserDetailsManager(user1, user2);
    }

}
