package com.yby.blog_backend.dao;

import com.yby.blog_backend.po.Tag;
import com.yby.blog_backend.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Boyu Yuan
 * @date 2020/6/12 21:35
 */

public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);

    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);
}
