package com.eltex.service;

import com.eltex.exceptions.NotFoundException;
import com.eltex.user.User;

import java.util.Collections;
import java.util.List;

public class UserService {
    private static long USER_ID = 1;
    private List<User> users = Collections.emptyList();

    public void save(final User user) {
        if (user.id() == 0) {
            user.builder().setId(USER_ID);

            USER_ID++;
            users.add(user);
        } else {
            User userEdit = getById(user.id());

            userEdit.builder()
                    .setLogin(user.login())
                    .setName(user.name())
                    .setAvatar(user.avatar());
        }
    }

    public void removeById(final long userId) {
        if (userId < 0) {
            throw new NotFoundException("There is no user with this ID");
        }

        users.removeIf(user -> user.id() == userId);
    }

    public User getById(final long userId) {
        return users.stream()
                .filter(user -> user.id() == userId)
                .findFirst()
                .orElseThrow(() -> new NotFoundException("There is no user with this ID."));
    }

    public List<User> getAll() {
        return users;
    }
}