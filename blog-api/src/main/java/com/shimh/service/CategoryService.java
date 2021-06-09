package com.shimh.service;

import java.util.List;

import com.shimh.entity.Category;
import com.shimh.vo.CategoryVO;

/**
 * @author xwq
 * <p>
 * 2021年4月25日
 */
public interface CategoryService {

    List<Category> findAll();

    Category getCategoryById(Integer id);

    Integer saveCategory(Category category);

    Integer updateCategory(Category category);

    void deleteCategoryById(Integer id);

    List<CategoryVO> findAllDetail();

    CategoryVO getCategoryDetail(Integer categoryId);

}
