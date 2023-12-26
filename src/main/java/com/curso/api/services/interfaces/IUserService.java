package com.curso.api.services.interfaces;

import com.curso.api.dtos.user.SaveUser;
import com.curso.api.persistence.entities.User;

public interface IUserService {
    User registerOneCustomer(SaveUser newUser);
}
