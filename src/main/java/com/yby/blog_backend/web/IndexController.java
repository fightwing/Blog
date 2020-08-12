package com.yby.blog_backend.web;

import com.yby.blog_backend.service.BlogService;
import com.yby.blog_backend.service.TagService;
import com.yby.blog_backend.service.TypeService;
import com.yby.blog_backend.vo.BlogQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author Boyu Yuan
 * @date 2020/5/31 19:57
 */


@Controller
public class IndexController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private TypeService typeService;

    @Autowired
    private TagService tagService;

    @GetMapping("/index")
    public String index(@PageableDefault(size = 10, sort = {"updateTime"}, direction = Sort.Direction.DESC) Pageable pageable,
                         Model model){
        model.addAttribute("page",blogService.listBlog(pageable));
        model.addAttribute("tags",tagService.listTagTop(8));
        System.out.println(tagService.listTagTop(8));
        model.addAttribute("types",typeService.listTypeTop(6));
        model.addAttribute("recommendBlogs",blogService.listRecommendBlogTop(8));
        return "index";
    }



    @PostMapping("/search")
    public String search(@PageableDefault(size = 8, sort = {"updateTime"}, direction = Sort.Direction.DESC) Pageable pageable,
                         @RequestParam String query, Model model){
        model.addAttribute("page",blogService.listBlog("%"+query+"%",pageable));
        model.addAttribute("query",query);
        return "search";
    }



    @GetMapping("/blog/{id}")
    public String blog(@PathVariable Long id, Model model){
        model.addAttribute("blog",blogService.getAndConvert(id));
        return "blog";
    }

    @GetMapping("/admin/blogs-input")
    public String blogs_input(){
        return "/admin/blogs-input";
    }


    @GetMapping("/footer/newblogs")
    public String newBlogs(Model model){
        model.addAttribute("newBlogs",blogService.listRecommendBlogTop(3));
        return "_fragments :: newBlogList";
    }
}
