package com.gustavobaiao.course.repositories;

import com.gustavobaiao.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
