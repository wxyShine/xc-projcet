package com.wxy97.content.model.dto;

import com.wxy97.content.model.po.CourseCategory;
import lombok.Data;

import java.util.List;

/**
 * @author wxy
 */
@Data
public class CourseCategoryTreeDto extends CourseCategory {
 List childrenTreeNodes;
}
