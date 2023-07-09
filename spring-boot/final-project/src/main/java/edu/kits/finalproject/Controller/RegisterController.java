package edu.kits.finalproject.Controller;

import edu.kits.finalproject.Domain.Account;
import edu.kits.finalproject.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("register")
public class RegisterController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private UserDetailsService userDetailsService;

    @PostMapping
    public String register(@RequestBody Account account) {
        System.out.println("email: " + account.getEmail());
        System.out.println("password: " + account.getPassword());
        System.out.println("name: " + account.getName());

//        accountService.saveAndFlush(account);
        return "Register Successfully";
    }
}
