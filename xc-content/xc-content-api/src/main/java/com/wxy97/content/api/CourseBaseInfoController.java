package com.wxy97.content.api;

import com.wxy97.base.exception.ValidationGroups;
import com.wxy97.base.model.PageParams;
import com.wxy97.base.model.PageResult;
import com.wxy97.content.model.dto.AddCourseDto;
import com.wxy97.content.model.dto.CourseBaseInfoDto;
import com.wxy97.content.model.dto.EditCourseDto;
import com.wxy97.content.model.dto.QueryCourseParamsDto;
import com.wxy97.content.model.po.CourseBase;
import com.wxy97.content.service.CourseBaseInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author wxy
 * @description 课程管理接口
 */
@Api(value = "课程管理接口", tags = "课程管理接口")
@RestController
public class CourseBaseInfoController {


    private final CourseBaseInfoService courseBaseInfoService;

    public CourseBaseInfoController(CourseBaseInfoService courseBaseInfoService) {
        this.courseBaseInfoService = courseBaseInfoService;
    }

    @ApiOperation("课程查询接口")
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams params, @RequestBody QueryCourseParamsDto queryCourseParamsDto) {
        //调用service获取数据
        PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(params, queryCourseParamsDto);

        return courseBasePageResult;
    }

    @PostMapping("/course")
    public CourseBaseInfoDto createCourseBase(@RequestBody @Validated(ValidationGroups.Inster.class) AddCourseDto addCourseDto) {

        Long companyId = 22L;
        return courseBaseInfoService.createCourseBase(companyId, addCourseDto);
    }


    @GetMapping("/course/{courseId}")
    public CourseBaseInfoDto getCourseBaseById(@PathVariable Long courseId) {


        return courseBaseInfoService.getCourseBaseInfo(courseId);
    }

    @PutMapping("/course")
    public CourseBaseInfoDto modifyCourseBase(@RequestBody EditCourseDto dto) {

        Long companyId = 1232141425L;
        return courseBaseInfoService.updateCourseBase(companyId, dto);
    }
}
