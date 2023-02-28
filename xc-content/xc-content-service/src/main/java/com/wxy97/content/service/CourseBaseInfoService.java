package com.wxy97.content.service;

import com.wxy97.base.model.PageParams;
import com.wxy97.base.model.PageResult;
import com.wxy97.content.model.dto.AddCourseDto;
import com.wxy97.content.model.dto.CourseBaseInfoDto;
import com.wxy97.content.model.dto.QueryCourseParamsDto;
import com.wxy97.content.model.po.CourseBase;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @description 课程管理service
 * @author wxy
 */
public interface CourseBaseInfoService {


 /**
  * @description 课程查询
  * @param params 分页参数
  * @param queryCourseParamsDto 查询条件
  * @return com.wxy97.base.model.PageResult<com.wxy97.content.model.po.CourseBase>
  * @author wxy
  * @date 2022/10/8 9:46
 */
  public PageResult<CourseBase>  queryCourseBaseList(PageParams params, QueryCourseParamsDto queryCourseParamsDto);

 /**
  * 新增课程
  * @param companyId 培训机构id
  * @param addCourseDto 新增课程的信息
  * @return 课程信息包括基本信息、营销信息
  */
  public CourseBaseInfoDto createCourseBase(Long companyId,AddCourseDto addCourseDto);
}
