package org.difly.socialnetwork.repository;

import org.difly.socialnetwork.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository  extends JpaRepository<User, String> {
}
