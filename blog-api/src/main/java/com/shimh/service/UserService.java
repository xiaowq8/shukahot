package com.shimh.service;

import java.util.List;

import com.shimh.entity.User;

/**
 * @author xwq
 * <p>
 * 2021年4月23日
 */
public interface UserService {

    List<User> findAll();

    User getUserByAccount(String account);

    User getUserById(Long id);

    Long saveUser(User user);

    Long updateUser(User user);

    void deleteUserById(Long id);
}
