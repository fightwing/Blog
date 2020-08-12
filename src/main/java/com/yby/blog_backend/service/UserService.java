package com.yby.blog_backend.service;

import com.yby.blog_backend.po.User;

/**
 * @author Boyu Yuan
 * @date 2020/6/8 1:26
 */
public interface UserService {
    User checkUser(String username, String password);
}
