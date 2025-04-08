package com.ryan.netSocial.services;

import com.ryan.netSocial.models.User;

import java.util.List;

public interface UserService {
    User save(User user);

    List<User> getAll();

    User get(Long id);

    User update(Long id, User user);

    void delete(Long id);
}
