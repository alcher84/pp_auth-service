package org.pp.converter;

import lombok.experimental.UtilityClass;
import org.pp.model.User;
import org.pp.model.UserDto;

@UtilityClass
public class UserDtoConverter {

    public static User convertUserDto(UserDto dto) {
        return User.builder()
                .userName(dto.getUserName())
                .userPassword(dto.getUserPassword())
                .firstName(dto.getFirstName())
                .secondName(dto.getSecondName())
                .email(dto.getEmail())
                .userRoleId(0)
                .build();
    }
}
