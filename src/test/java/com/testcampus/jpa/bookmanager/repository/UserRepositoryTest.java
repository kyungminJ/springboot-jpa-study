package com.testcampus.jpa.bookmanager.repository;

import com.testcampus.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

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
//        User user = userRepository.findById(1L).orElse(null);
//        System.out.println(user);

//        userRepository.saveAndFlush(new User("new martin", "newMartin@naver.com"));
//        userRepository.findAll().forEach(System.out::println);

//        long count = userRepository.count();
//        System.out.println(count);

//        boolean exists = userRepository.existsById(1L);
//        System.out.println(exists);

//        userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));
//        userRepository.deleteById(1L);
//        userRepository.deleteAll();
//        userRepository.deleteAll(userRepository.findAllById(Lists.newArrayList(1L, 3L)));
//        userRepository.deleteAllInBatch(userRepository.findAllById(Lists.newArrayList(1L, 3L)));
//        userRepository.deleteAllInBatch();
//        userRepository.findAll().forEach(System.out::println);

//        Page<User> users = userRepository.findAll(PageRequest.of(0, 3));
//        System.out.println("page : " + users);
//        System.out.println("totalElements : " + users.getTotalElements());
//        System.out.println("totalPages : " + users.getTotalPages());
//        System.out.println("numberOfElements : " + users.getNumberOfElements());
//        System.out.println("sort : " + users.getSort());
//        System.out.println("size : " + users.getSize());
//        users.getContent().forEach(System.out::println);

//        ExampleMatcher matcher = ExampleMatcher.matching()
//                .withIgnorePaths("name")
//                .withMatcher("email", endsWith());
//        Example<User> example = Example.of(new User("ma", "fastcampus.com"), matcher);
//        userRepository.findAll(example).forEach(System.out::println);

        User user = new User();
        user.setEmail("fast");
        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("email", contains());
        Example<User> example = Example.of(user, matcher);
        userRepository.findAll(example).forEach(System.out::println);
    }

    @Test
    void select() {
//        System.out.println(userRepository.findByName("dennis"));
//        System.out.println("findByEmail : " + userRepository.findByEmail("martin@fastcampus.com"));
//        System.out.println("getByEmail : " + userRepository.getByEmail("martin@fastcampus.com"));
//        System.out.println("readByEmail : " + userRepository.readByEmail("martin@fastcampus.com"));
//        System.out.println("queryByEmail : " + userRepository.queryByEmail("martin@fastcampus.com"));
//        System.out.println("searchByEmail : " + userRepository.searchByEmail("martin@fastcampus.com"));
//        System.out.println("streamByEmail : " + userRepository.streamByEmail("martin@fastcampus.com"));
//        System.out.println("findUserByEmail : " + userRepository.findUserByEmail("martin@fastcampus.com"));
//        System.out.println("findSomethingByEmail : " + userRepository.findSomethingByEmail("martin@fastcampus.com"));

//        System.out.println("findFirst2ByName : " + userRepository.findFirst2ByName("martin"));
//        System.out.println("findTop2ByName : " + userRepository.findTop2ByName("martin"));
//        System.out.println("findLastByName : " + userRepository.findLast1ByName("martin"));

//        System.out.println("findByEmailAndName : " + userRepository.findByEmailAndName("martin@fastcampus.com", "martin"));
//        System.out.println("findByEmailOrName : " + userRepository.findByEmailOrName("martin@fastcampus.com", "dennis"));

//        System.out.println("findByCreatedAtAfter : " + userRepository.findByCreatedAtAfter(LocalDateTime.now().minusDays(1L)));
//        System.out.println("findByCreatedAtBefore : " + userRepository.findByCreatedAtBefore(LocalDateTime.now()));
//        System.out.println("findByIdAfter : " + userRepository.findByIdAfter(4L));

//        System.out.println("findByCreatedAtGreaterThan : " + userRepository.findByCreatedAtGreaterThan(LocalDateTime.now().minusDays(1L)));
//        System.out.println("findByCreatedAtGreaterThanEqual : " + userRepository.findByCreatedAtGreaterThanEqual(LocalDateTime.now().minusDays(1L)));
//        System.out.println("findByCreatedAtLessThan : " + userRepository.findByCreatedAtLessThan(LocalDateTime.now().plusDays(1L)));
//        System.out.println("findByCreatedAtLessThanEqual : " + userRepository.findByCreatedAtLessThanEqual(LocalDateTime.now().plusDays(1L)));

//        System.out.println("findByCreatedAtBetween : " + userRepository.findByCreatedAtBetween(LocalDateTime.now().minusDays(1L), LocalDateTime.now().plusDays(1L)));
//        System.out.println("findByIdBetween : " + userRepository.findByIdBetween(1L, 3L));
//        System.out.println("findByIdGreaterThanEqualAndLessThanEqual : " + userRepository.findByIdGreaterThanEqualAndIdLessThanEqual(1L, 3L));

//        System.out.println("findByIdIsNotNull : " + userRepository.findByIdIsNotNull());
//        System.out.println("findByAddressIsNotEmpty : " + userRepository.findByAddressIsNotEmpty());

//        System.out.println("findByNameIn : " + userRepository.findByNameIn(Lists.newArrayList("martin", "dennis")));

//        System.out.println("findByNameLike : " + userRepository.findByNameLike("%art%"));
//        System.out.println("findByNameStartingWith : " + userRepository.findByNameStartingWith("mar"));
//        System.out.println("findByNameEndingWith : " + userRepository.findByNameEndingWith("tin"));
//        System.out.println("findByNameContains : " + userRepository.findByNameContains("art"));
    }

    @Test
    void pagingAndSortingTest() {
//        System.out.println("findTop1ByName : " + userRepository.findTop1ByName("martin"));
//        System.out.println("findLast1ByName : " + userRepository.findLast1ByName("martin")); // Last1 은 없는 키워드이므로 의도한대로 실행 안됨
//        System.out.println("findTop1ByNameOrderByIdDesc : " + userRepository.findTop1ByNameOrderByIdDesc("martin"));
//        System.out.println("findTopByNameOrderByIdDesc : " + userRepository.findTopByNameOrderByIdDesc("martin"));
//        System.out.println("findFirstByNameOrderByIdDescEmailAsc : " + userRepository.findFirstByNameOrderByIdDescEmailAsc("martin"));
//        System.out.println("findFirstByNameWithSortParams : " + userRepository.findFirstByName("marin", Sort.by(Sort.Order.desc("id"), Sort.Order.asc("email"))));

        System.out.println("findByNameWithPaging : " + userRepository.findByName("martin", PageRequest.of(0, 1, Sort.by(Sort.Order.desc("id")))).getContent());
        System.out.println("findByNameWithPaging : " + userRepository.findByName("martin", PageRequest.of(1, 1, Sort.by(Sort.Order.desc("id")))).getTotalElements());
    }
}