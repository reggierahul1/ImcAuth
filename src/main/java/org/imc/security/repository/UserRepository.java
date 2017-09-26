package org.imc.security.repository;

import org.imc.model.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rahul on 26.09.17.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
