package edu.kits.springmvc.Controller;

import edu.kits.springmvc.Service.UserService;
import edu.kits.springmvcdemo.UserDTO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping
    public String getAllUsers(Model model) {
        System.out.println("Exercuting Controller - getAllUsers");
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "userList";
    }

    @GetMapping("/json")
    @ResponseBody
    public List<User> getAllUsersJson(Model model) {
        System.out.println("Exercuting Controller - getAllUsers");
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return users;
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id, Model model) {
        System.out.println("Exercuting Controller - getUserById");
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "userDetails";
    }


// Other controller methods for creating, updating, and deleting users
}
