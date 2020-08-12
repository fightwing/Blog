package com.yby.blog_backend.service;

import com.yby.blog_backend.po.Comment;


import java.util.List;

/**
 * @author Boyu Yuan
 * @date 2020/7/22 21:17
 */

public interface ComentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
