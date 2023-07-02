package edu.kits.springmvc.Service;

import edu.kits.springmvcdemo.UserDTO.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    List<User> users = new ArrayList<>() {
        {
            add(new User("Nam", 0L));
            add(new User("Quynh Anh", 1L));
        }
    };
    public List<User> getAllUsers() {
        return this.users;
    }

    public User getUserById(Long id) {
        List<User> users =  this.users.stream().filter(user -> user.id == id).collect(Collectors.toList());
        if(users.size() > 0) {
            return users.get(0);
        }
        return null;
    }
}
