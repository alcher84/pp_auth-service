package org.pp.repository;

import org.pp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserNameAndUserPassword(String userName, String userPassword);
}
