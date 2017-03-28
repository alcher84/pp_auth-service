package org.pp.web.api;

import org.pp.model.AuthResponse;
import org.pp.model.UserDto;
import org.pp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping
    public AuthResponse register(@RequestBody @Validated final UserDto userDto) {
        userService.createUser(userDto);
        return null;
    }

    @PostMapping
    public AuthResponse signin(@RequestBody @Validated final String userName,
                               @RequestBody @Validated final String userPassword) {
        userService.findUser(userName, userPassword);
        return null;
    }
}
