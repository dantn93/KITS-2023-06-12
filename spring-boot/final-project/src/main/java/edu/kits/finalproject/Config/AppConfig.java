package edu.kits.finalproject.Config;

import edu.kits.finalproject.Domain.Account;
import edu.kits.finalproject.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.Collection;

@Configuration
public class AppConfig {

    @Autowired
    private AccountService accountService;

    @Bean
    public UserDetailsService userDetailsService() {
       InMemoryUserDetailsManager inmem = new InMemoryUserDetailsManager();
        Collection<Account> accounts = accountService.findAll();

        for(Account a : accounts) {
            UserDetails user =
                    User.builder().username(a.getEmail()).password(a.getPassword()).roles("ADMIN").build();
            inmem.createUser(user);
        }
        return inmem;
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }
}
