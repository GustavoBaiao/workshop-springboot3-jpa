package com.gustavobaiao.course.com.gustavobaiao.course.resources;

import com.gustavobaiao.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L,"Maria", "maria@gmail.com","12345" , "99999999" );
        return ResponseEntity.ok().body(user);
    }
}
