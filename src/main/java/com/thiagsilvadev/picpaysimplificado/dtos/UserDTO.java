package com.thiagsilvadev.picpaysimplificado.dtos;

import java.math.BigDecimal;

import com.thiagsilvadev.picpaysimplificado.domain.user.UserType;

public record UserDTO(String firstName, String lastName, String document, String email, String password, BigDecimal balance, UserType userType) {

}
