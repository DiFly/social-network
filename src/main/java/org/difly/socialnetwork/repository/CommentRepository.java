package org.difly.socialnetwork.repository;

import org.difly.socialnetwork.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
