package org.difly.socialnetwork.service;

import org.difly.socialnetwork.domain.Comment;
import org.difly.socialnetwork.domain.User;
import org.difly.socialnetwork.domain.Views;
import org.difly.socialnetwork.dto.EventType;
import org.difly.socialnetwork.dto.ObjectType;
import org.difly.socialnetwork.repository.CommentRepository;
import org.difly.socialnetwork.util.WsSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.BiConsumer;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final BiConsumer<EventType, Comment> wsSender;

    @Autowired
    public CommentService(CommentRepository commentRepository, WsSender wsSender) {
        this.commentRepository = commentRepository;
        this.wsSender = wsSender.getSender(ObjectType.COMMENT, Views.FullComment.class);
    }

    public Comment create(Comment comment, User user){
        comment.setAuthor(user);
        Comment commentFromDb = commentRepository.save(comment);

        wsSender.accept(EventType.CREATE, comment);

        return commentFromDb;
    }
}
