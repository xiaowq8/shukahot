package com.shimh.vo;

import com.shimh.entity.Category;

/**
 * @author xwq
 * <p>
 * 2021年4月29日
 */
public class CategoryVO extends Category {

    /**
     *
     */
    private static final long serialVersionUID = -2975739216517528014L;


    private int articles;

    public int getArticles() {
        return articles;
    }

    public void setArticles(int articles) {
        this.articles = articles;
    }


}
