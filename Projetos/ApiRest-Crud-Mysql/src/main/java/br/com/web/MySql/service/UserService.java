package br.com.web.MySql.service;

import br.com.web.MySql.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getUsers();

    User getUser(Integer id);

    void updateUser(Integer id, User user);

    void deleteUser(Integer id);
}
