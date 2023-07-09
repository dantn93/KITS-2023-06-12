package edu.kits.finalproject.Controller.Admin;

import edu.kits.finalproject.Domain.Account;
import edu.kits.finalproject.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/users")
    public List<Account> getUser() {
        System.out.println("getting users");
        return accountService.findAll();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal) {
        return principal.getName();
    }
}