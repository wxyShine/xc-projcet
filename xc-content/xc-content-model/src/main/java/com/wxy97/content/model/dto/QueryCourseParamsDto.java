package com.wxy97.content.model.dto;

import lombok.Data;

/**
 * @author wxy
 */
@Data
public class QueryCourseParamsDto {

    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String publishStatus;
}
