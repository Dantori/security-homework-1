package ru.trofimov.securityhomework.service;

import ru.trofimov.securityhomework.domain.User;

import java.util.List;

public interface UserService {

    boolean addUser(User user);
//    User getUserById(Long id);
    List<User> getAllUsers();
    void deleteUserById(Long id);
}
