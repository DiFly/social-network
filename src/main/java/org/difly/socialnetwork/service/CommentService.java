package org.difly.socialnetwork.service;

import org.difly.socialnetwork.domain.Comment;
import org.difly.socialnetwork.domain.User;
import org.difly.socialnetwork.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment create(Comment comment, User user){
        comment.setAuthor(user);
        commentRepository.save(comment);

        return comment;
    }
}
