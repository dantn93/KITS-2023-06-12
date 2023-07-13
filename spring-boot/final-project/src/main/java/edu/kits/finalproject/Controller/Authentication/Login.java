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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/login")
public class Login {

    @Autowired
    private UtilsService utilsService;

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping
    public ResponseEntity<RegisterResponseDto> login(@RequestBody RegisterRequestDto registerRequest,
                                                     HttpServletResponse response) {
        // user entity
        User user = userService.findByUsername(registerRequest.getUsername());
        System.out.println("USER: " + user);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new RegisterResponseDto("User not found", "",
                    "", "USER_NOT_FOUND"));
        } else {
            // if user exists
            if (bCryptPasswordEncoder.matches(registerRequest.getPassword(), user.getPassword())) {
                //1. generate new token
                String newToken = utilsService.getRandomHexString(150);
                System.out.println("NEW TOKEN: " + newToken);
                //2. update token
                userService.updateTokenById(newToken, user.getUserId());
                // Set cookie
                Cookie cookie = new Cookie("token", newToken);
                cookie.setMaxAge(3600);
                response.addCookie(cookie);

                return ResponseEntity.status(HttpStatus.OK).body(new RegisterResponseDto("Login Successfully", "",
                        "", ""));
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new RegisterResponseDto("Wrong user or password", "", "", "USER_OR_PASSWORD_INVALID"));
            }
        }
    }
}
