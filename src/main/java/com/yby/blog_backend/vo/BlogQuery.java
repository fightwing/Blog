package com.yby.blog_backend.vo;

/**
 * @author Boyu Yuan
 * @date 2020/7/3 14:49
 */
public class BlogQuery {

    private String title;
    private Long TypeId;
    private boolean recommend;

    public BlogQuery() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getTypeId() {
        return TypeId;
    }

    public void setTypeId(Long typeId) {
        TypeId = typeId;
    }

    public boolean isRecommend() {
        return recommend;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }
}
