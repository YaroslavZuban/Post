package com.eltex.service;

import com.eltex.post.Attachment;
import com.eltex.post.Coordinates;
import com.eltex.post.Post;

public class WallService {
    private static int postId = 0;

    @Override
    public String toString() {
        return "" + post;
    }

    private Post post = new Post.Builder().build();

    public WallService() {
        setId();
    }

    private void setId() {
        post = post.builder()
                .setId(postId)
                .build();

        postId++;
    }

    public void setAuthorId(final int authorId) {
        post = post.builder()
                .setAuthorId(authorId)
                .build();
    }

    public void setAuthor(final String author) {
        post = post.builder()
                .setAuthor(author)
                .build();
    }

    public void setAuthorJob(final String authorJob) {
        post = post.builder()
                .setAuthorJob(authorJob)
                .build();
    }

    public void setAuthorAvatar(final String authorAvatar) {
        post = post.builder()
                .setAuthorAvatar(authorAvatar)
                .build();
    }

    public void setContent(final String content) {
        post = post.builder()
                .setContext(content)
                .build();
    }

    public void setPublished(final String published) {
        post = post.builder()
                .setPublished(published)
                .build();
    }

    public void setLink(final String link) {
        post = post.builder()
                .setLink(link)
                .build();
    }

    public void setMentionedMe(final boolean mentionedMe) {
        post = post.builder()
                .setMentionedMe(mentionedMe)
                .build();
    }

    public void setLinkedByMe(final boolean linkedByMe) {
        post = post.builder()
                .setLikedByMe(linkedByMe)
                .build();
    }

    public void setCoordinates(final Coordinates coordinates) {
        post = post.builder()
                .setCoordinates(coordinates)
                .build();
    }

    public void setAttachment(final Attachment attachment) {
        post = post.builder()
                .setAttachment(attachment)
                .build();
    }

    public Post getPost() {
        return post;
    }
}