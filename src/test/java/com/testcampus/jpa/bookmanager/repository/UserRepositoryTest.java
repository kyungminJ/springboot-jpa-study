package com.testcampus.jpa.bookmanager.repository;

import com.testcampus.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() {
//        List<User> users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
//        List<User> users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
//        List<User> users = userRepository.findAllById(Lists.newArrayList(1L, 3L, 5L));
//        users.forEach(System.out::println);

//        User user1 = new User("jack", "jack@naver.com");
//        User user2 = new User("david", "david@naver.com");
//        userRepository.saveAll(Lists.newArrayList(user1, user2));
//        userRepository.save(user1);
//        List<User> users = userRepository.findAll();
//        users.forEach(System.out::println);

//        User user = userRepository.getOne(1L);
        User user = userRepository.findById(1L).orElse(null);
        System.out.println(user);
    }
}