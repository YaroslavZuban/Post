package com.eltex.post;

import org.jetbrains.annotations.Nullable;

public record Post(int id, int authorId, String author, String authorJob, String authorAvatar, String context,
                   String published, String link, boolean mentionedMe, boolean likedByMe,
                   @Nullable Coordinates coordinates,
                   @Nullable Attachment attachment) {

    public Builder builder() {
        return new Builder()
                .setId(id)
                .setAuthorId(authorId)
                .setAuthor(author)
                .setAuthorJob(authorJob)
                .setAuthorAvatar(authorAvatar)
                .setContext(context)
                .setPublished(published)
                .setLink(link)
                .setMentionedMe(mentionedMe)
                .setLikedByMe(likedByMe)
                .setCoordinates(coordinates)
                .setAttachment(attachment);
    }

    public static class Builder {
        private int id = 0;
        private int authorId = 0;
        private String author = "";
        private String authorJob = "";
        private String authorAvatar = "";
        private String context = "";
        private String published = "";
        private String link = "";
        private boolean mentionedMe = false;
        private boolean likedByMe = false;
        private Coordinates coordinates;
        private Attachment attachment;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setAuthorId(final int authorId) {
            this.authorId = authorId;
            return this;
        }

        public Builder setAuthor(final String author) {
            this.author = author;
            return this;
        }

        public Builder setAuthorJob(final String authorJob) {
            this.authorJob = authorJob;
            return this;
        }

        public Builder setAuthorAvatar(final String authorAvatar) {
            this.authorAvatar = authorAvatar;
            return this;
        }

        public Builder setContext(final String context) {
            this.context = context;
            return this;
        }

        public Builder setPublished(final String published) {
            this.published = published;
            return this;
        }

        public Builder setLink(final String link) {
            this.link = link;
            return this;
        }

        public Builder setMentionedMe(final boolean mentionedMe) {
            this.mentionedMe = mentionedMe;
            return this;
        }

        public Builder setLikedByMe(boolean likedByMe) {
            this.likedByMe = likedByMe;
            return this;
        }

        public Builder setCoordinates(@Nullable Coordinates coordinates) {
            this.coordinates = coordinates;
            return this;
        }

        public Builder setAttachment(@Nullable Attachment attachment) {
            this.attachment = attachment;
            return this;
        }

        public Post build() {
            return new Post(id, authorId, author, authorJob,
                    authorAvatar, context, published,
                    link, mentionedMe, likedByMe, coordinates, attachment);
        }

    }
}