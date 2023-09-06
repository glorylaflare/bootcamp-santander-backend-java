package me.dio.santanderbackend2023.service;

import me.dio.santanderbackend2023.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
