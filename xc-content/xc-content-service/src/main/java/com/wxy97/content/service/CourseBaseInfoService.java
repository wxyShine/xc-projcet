package com.wxy97.content.service;

import com.wxy97.base.model.PageParams;
import com.wxy97.base.model.PageResult;
import com.wxy97.content.model.dto.AddCourseDto;
import com.wxy97.content.model.dto.CourseBaseInfoDto;
import com.wxy97.content.model.dto.EditCourseDto;
import com.wxy97.content.model.dto.QueryCourseParamsDto;
import com.wxy97.content.model.po.CourseBase;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @description 课程管理service
 * @author wxy
 */
public interface CourseBaseInfoService {


 /**
  * @param params               分页参数
  * @param queryCourseParamsDto 查询条件
  * @return com.xuecheng.base.model.PageResult<com.xuecheng.content.model.po.CourseBase>
  * @description 课程查询
  * @author Mr.M
  * @date 2022/10/8 9:46
  */
 public PageResult<CourseBase> queryCourseBaseList(PageParams params, QueryCourseParamsDto queryCourseParamsDto);


 /**
  * @param companyId    机构id
  * @param addCourseDto 添加课程的信息
  * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
  * @description 新增课程
  * @author Mr.M
  * @date 2022/10/8 15:53
  */
 CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);


 /**
  * @param courseId 课程id
  * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
  * @description 根据id查询课程信息
  */
 public CourseBaseInfoDto getCourseBaseInfo(Long courseId);


 /**
  * @param companyId 机构id，要校验本机构只能修改本机构的课程
  * @param dto       课程信息
  * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
  * @description 修改课程信息
  */
 public CourseBaseInfoDto updateCourseBase(Long companyId, EditCourseDto dto);
}
