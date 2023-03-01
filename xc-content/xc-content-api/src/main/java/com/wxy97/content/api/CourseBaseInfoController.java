package com.wxy97.content.api;

import com.wxy97.base.model.PageParams;
import com.wxy97.base.model.PageResult;
import com.wxy97.content.model.dto.AddCourseDto;
import com.wxy97.content.model.dto.CourseBaseInfoDto;
import com.wxy97.content.model.dto.QueryCourseParamsDto;
import com.wxy97.content.model.po.CourseBase;
import com.wxy97.content.service.CourseBaseInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description TODO
 * @author wxy

 */
@Api(value = "课程管理接口",tags = "课程管理接口")
@RestController
public class CourseBaseInfoController {


    private final   CourseBaseInfoService courseBaseInfoService;

    public CourseBaseInfoController(CourseBaseInfoService courseBaseInfoService) {
        this.courseBaseInfoService = courseBaseInfoService;
    }

    @ApiOperation("课程查询接口")
    @PostMapping("/course/list")
  public PageResult<CourseBase> list(PageParams params, @RequestBody QueryCourseParamsDto queryCourseParamsDto){
        //调用service获取数据
        PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(params, queryCourseParamsDto);

        return  courseBasePageResult;
    }

    @ApiOperation("新增课程")
    @PostMapping("/course")
    public CourseBaseInfoDto createCourseBase(@RequestBody AddCourseDto addCourseDto){

        //获取当前用户所属培训机构的id
        Long companyId = 22L;

        //调用service
        CourseBaseInfoDto courseBase = courseBaseInfoService.createCourseBase(companyId, addCourseDto);
        return courseBase;
    }

}
