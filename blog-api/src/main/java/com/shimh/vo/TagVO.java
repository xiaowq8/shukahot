package com.shimh.vo;

import com.shimh.entity.Tag;

/**
 * @author xwq
 * <p>
 * 2021年4月29日
 */
public class TagVO extends Tag {

    /**
     *
     */
    private static final long serialVersionUID = 5059212992497947120L;
    private int articles;

    public int getArticles() {
        return articles;
    }

    public void setArticles(int articles) {
        this.articles = articles;
    }


}
