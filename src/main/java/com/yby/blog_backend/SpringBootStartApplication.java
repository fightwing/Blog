package com.yby.blog_backend;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author Boyu Yuan
 * @date 2020/8/7 17:48
 */
public class SpringBootStartApplication  extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BlogBackendApplication.class);
    }
}
