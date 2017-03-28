package org.pp.service;

import org.pp.model.User;
import org.pp.model.UserDto;

public interface UserService {

    void createUser(UserDto user);

    User findUser(String userName, String userPassword);
}
