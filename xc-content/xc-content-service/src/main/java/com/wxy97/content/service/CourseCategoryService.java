package com.wxy97.content.service;

import com.wxy97.content.model.dto.CourseCategoryTreeDto;

import java.util.List;

/**
 * @author wxy
 */
public interface CourseCategoryService {

    /**
     * 课程分类查询
     * @param id 根结点id
     * @return 根结点下边的所有子结点
     */
    List<CourseCategoryTreeDto>  queryTreeNodes(String id);
}
