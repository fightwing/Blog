package com.yby.blog_backend.service;

import com.yby.blog_backend.po.Blog;
import com.yby.blog_backend.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * @author Boyu Yuan
 * @date 2020/7/3 12:37
 */
public interface BlogService {
    Blog getBlog(Long id);
    Blog getAndConvert(Long id);
    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);
    Page<Blog> listBlog(Pageable pageable);
    Page<Blog> listBlog(Long tagId, Pageable pageable);
    Page<Blog> listBlog(String query, Pageable pageable);
    List<Blog> listRecommendBlogTop(Integer size);
    Map<String,List<Blog>> archiveBlog();
    Long countBlog();
    Blog saveBlog(Blog blog);
    Blog updateBlog(Long id, Blog blog);
    void deleteBlog(Long id);
}
