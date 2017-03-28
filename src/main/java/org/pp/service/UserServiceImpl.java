package org.pp.service;

import org.pp.converter.UserDtoConverter;
import org.pp.model.User;
import org.pp.model.UserDto;
import org.pp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void createUser(UserDto dto) {
        userRepository.save(UserDtoConverter.convertUserDto(dto));
    }

    @Override
    public User findUser(String userName, String userPassword) {
        return userRepository.findByUserNameAndUserPassword(userName, userPassword);
    }
}
