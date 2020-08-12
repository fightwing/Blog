package com.yby.blog_backend.dao;

import com.yby.blog_backend.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Boyu Yuan
 * @date 2020/6/8 1:31
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsernameAndPassword(String username, String password);

}
