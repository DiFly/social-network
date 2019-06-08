package org.difly.socialnetwork.repository;

import org.difly.socialnetwork.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
