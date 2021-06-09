package com.shimh.repository.wrapper;

import java.util.List;

import com.shimh.vo.TagVO;

/**
 * @author xwq
 * <p>
 * 2021年4月25日
 */
public interface TagWrapper {

    List<TagVO> findAllDetail();

    TagVO getTagDetail(Integer tagId);
}
