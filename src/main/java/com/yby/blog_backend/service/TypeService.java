package com.yby.blog_backend.service;

import com.yby.blog_backend.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import java.util.List;

/**
 * @author Boyu Yuan
 * @date 2020/6/12 21:29
 */
public interface TypeService {
    Type saveType(Type type);
    Type getType(Long id);
    Type getTypeByName(String name);
    Page<Type> listType(Pageable pageable);
    List<Type> listType();
    List<Type> listTypeTop(Integer size);
    Type updateType(Long id,Type type);
    void deleteType(Long id);
}
