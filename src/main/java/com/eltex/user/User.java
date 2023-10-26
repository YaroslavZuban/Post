package com.eltex.user;

import org.jetbrains.annotations.Nullable;

public record User(long id, String login, String name, @Nullable String avatar) {
    public Builder builder() {
        return new Builder()
                .setId(id)
                .setLogin(login)
                .setName(name)
                .setAvatar(avatar);
    }

    public static class Builder {
        private long id = 0;
        private String login = "";
        private String name = "";
        private String avatar = "";

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setLogin(String login) {
            this.login = login;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAvatar(@Nullable String avatar) {
            this.avatar = avatar;
            return this;
        }

        public User build() {
            return new User(id, login, name, avatar);
        }
    }
}