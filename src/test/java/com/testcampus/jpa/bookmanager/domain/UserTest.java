package com.testcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void Test() {
        User user = new User();
        user.setName("test");
        user.setEmail("test@naver.com");

        User user1 = new User(null, "test", "test@naver.com", LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("test", "test@naver.com");
        User user3 = User.builder()
                .name("test")
                .email("test@naver.com")
                .build();

        System.out.println("user  : " + user);
        System.out.println("user1 : " + user1);
        System.out.println("user2 : " + user2);
        System.out.println("user3 : " + user3);
    }
}