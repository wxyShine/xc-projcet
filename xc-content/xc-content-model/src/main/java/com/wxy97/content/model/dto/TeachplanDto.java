package com.wxy97.content.model.dto;

import com.wxy97.content.model.po.Teachplan;
import com.wxy97.content.model.po.TeachplanMedia;
import lombok.Data;

import java.util.List;

@Data
public class TeachplanDto extends Teachplan {

   //课程计划关联的媒资信息
   TeachplanMedia teachplanMedia;

    //子目录
   List<TeachplanDto> teachPlanTreeNodes;
}
