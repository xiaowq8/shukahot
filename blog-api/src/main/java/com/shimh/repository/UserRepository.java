package com.shimh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shimh.entity.User;

/**
 * @author xwq
 * <p>
 * 2021年4月23日
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByAccount(String account);

}
