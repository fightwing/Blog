package com.yby.blog_backend.service;

import com.yby.blog_backend.dao.UserRepository;
import com.yby.blog_backend.po.User;
import com.yby.blog_backend.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Boyu Yuan
 * @date 2020/6/8 1:28
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
