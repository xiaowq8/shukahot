package com.shimh.repository.wrapper;

import java.util.List;

import com.shimh.vo.CategoryVO;

/**
 * @author xwq
 * <p>
 * 2021年4月25日
 */
public interface CategoryWrapper {

    List<CategoryVO> findAllDetail();

    CategoryVO getCategoryDetail(Integer categoryId);
}
