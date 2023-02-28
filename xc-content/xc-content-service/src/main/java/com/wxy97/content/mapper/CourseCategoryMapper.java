package com.wxy97.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxy97.content.model.dto.CourseCategoryTreeDto;
import com.wxy97.content.model.po.CourseCategory;

import java.util.List;

/**
 * <p>
 * 课程分类 Mapper 接口
 * </p>
 *
 * @author wxy
 */
public interface CourseCategoryMapper extends BaseMapper<CourseCategory> {

    List<CourseCategoryTreeDto> selectTreeNodes(String id);
}
