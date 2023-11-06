package com.eltex.service;

import com.eltex.exceptions.NotFoundException;
import com.eltex.post.Post;
import com.eltex.user.User;

import java.util.Collections;
import java.util.List;

public class UserService {
    private long userId;
    private List<User> users = Collections.emptyList();

    public UserService(long userId) {
        this.userId = userId;
    }

    public void save(User user) {
        if (user.id() == 0) {
            users.add(user.builder().setId(++userId).build());
        } else {
            updateUser(user);
        }
    }

    public void updateUser(final User userUpdated) {
        for (int i = 0; i < users.size(); i++) {
            final User iterator = users.get(i);

            if (iterator.id() == userUpdated.id()) {
                users.set(i, userUpdated);
                break;
            }
        }
    }

    public void removeById(final long userId) {
        if (userId < 0) {
            throw new NotFoundException("The user ID cannot be negative");
        }

        boolean removed = users.removeIf(user -> user.id() == userId);

        if (!removed) {
            throw new NotFoundException("User with id " + userId + " not found.");
        }
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