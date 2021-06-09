package com.shimh.repository;

import java.util.List;

import com.shimh.repository.wrapper.ArticleWrapper;
import com.shimh.vo.PageVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.shimh.entity.Article;
import com.shimh.entity.Category;
import com.shimh.entity.Tag;

/**
 * @author xwq
 * <p>
 * 2021年4月25日
 */
public interface ArticleRepository extends JpaRepository<Article, Integer>, ArticleWrapper {

    List<Article> findByTags(Tag tag);

    List<Article> findByCategory(Category category);

    @Query(value = "select * from me_article order by view_counts desc limit :limit", nativeQuery = true)
    List<Article> findOrderByViewsAndLimit(@Param("limit") int limit);

    @Query(value = "select * from me_article order by create_date desc limit :limit", nativeQuery = true)
    List<Article> findOrderByCreateDateAndLimit(@Param("limit") int limit);

}
