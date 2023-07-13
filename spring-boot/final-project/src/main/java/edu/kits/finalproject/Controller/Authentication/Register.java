package edu.kits.finalproject.Controller.Authentication;

import edu.kits.finalproject.Entity.User;
import edu.kits.finalproject.Model.RegisterRequestDto;
import edu.kits.finalproject.Model.RegisterResponseDto;
import edu.kits.finalproject.Service.UserService;
import edu.kits.finalproject.Utils.UtilsService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/register")
public class Register {

    @Autowired
    private UtilsService utilsService;

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping
    public ResponseEntity<RegisterResponseDto> register(@RequestBody RegisterRequestDto registerRequest, HttpServletResponse response) {
        // user entity
        User user = new User();
        user.setFullname(registerRequest.getFullname());
        user.setRole(registerRequest.getRole());
        user.setUsername(registerRequest.getUsername());

        User foundUser = userService.findByUsername(registerRequest.getUsername());
        System.out.println("foundUser: " + foundUser);
        // Generate password
        if(foundUser == null) {
            try {
                user.setPassword(bCryptPasswordEncoder.encode(registerRequest.getPassword()));
                user.setToken(UtilsService.getRandomHexString(150));
                User result = userService.saveAndFlush(user);
                // Set cookie
                Cookie cookie = new Cookie("token", user.getToken());
                cookie.setMaxAge(3600);
                //add cookie to response
                response.addCookie(cookie);

                return ResponseEntity.status(HttpStatus.OK).body(new RegisterResponseDto("Register Successfully", result, "",
                        ""));
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new RegisterResponseDto("", "", e.getMessage(),
                        "UNKNOWN_ERROR"));
            }
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new RegisterResponseDto("User already exists", "",
                    "", "USER_EXIST"));
        }
    }
}

