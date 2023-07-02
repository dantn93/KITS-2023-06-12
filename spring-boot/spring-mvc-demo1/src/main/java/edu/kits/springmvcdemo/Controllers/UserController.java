package edu.kits.springmvcdemo.Controllers;

import edu.kits.springmvcdemo.Services.UserService;
import edu.kits.springmvcdemo.UserDTO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping
    public String getAllUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "userList";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "userDetails";
    }
// Other controller methods for creating, updating, and deleting users
}
