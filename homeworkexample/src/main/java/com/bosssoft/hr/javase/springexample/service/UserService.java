package com.bosssoft.hr.javase.springexample.service;

import com.bosssoft.hr.javase.springexample.pojo.entity.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {
    List<User> listAll();

    boolean insert(User user);

    boolean remove(Long id);

    boolean update(User user);

    List<User> queryUserByPage(Integer pageNum, Integer pageSize);

//    User getUserByName(String name);
//
//    boolean login(String username, String password);
}
