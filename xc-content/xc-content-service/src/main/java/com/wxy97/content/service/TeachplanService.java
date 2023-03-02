package com.wxy97.content.service;

import com.wxy97.content.model.dto.SaveTeachplanDto;
import com.wxy97.content.model.dto.TeachplanDto;

import java.util.List;


public interface TeachplanService {

 public List<TeachplanDto> findTeachplayTree(Long courseId);

 /**
  * @description 保存课程计划(新增/修改)
  * @param dto
 */
 public void saveTeachplan(SaveTeachplanDto dto);

}
