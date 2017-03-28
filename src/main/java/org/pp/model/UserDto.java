package org.pp.model;

import lombok.Value;

import javax.validation.constraints.NotNull;

@Value
public class UserDto {

    @NotNull private String userName;
    @NotNull private String userPassword;
    @NotNull private String firstName;
    @NotNull private String secondName;
    @NotNull private String email;
}
