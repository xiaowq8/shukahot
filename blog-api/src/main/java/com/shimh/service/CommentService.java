package com.shimh.service;

import java.util.List;

import com.shimh.entity.Category;
import com.shimh.entity.Comment;
import com.shimh.vo.CategoryVO;

/**
 * @author xwq
 * <p>
 * 2021年4月25日
 */
public interface CommentService {

    List<Comment> findAll();

    Comment getCommentById(Integer id);

    Integer saveComment(Comment comment);

    void deleteCommentById(Integer id);

    List<Comment> listCommentsByArticle(Integer id);

    Comment saveCommentAndChangeCounts(Comment comment);

    void deleteCommentByIdAndChangeCounts(Integer id);


}
