package com.wxy97.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxy97.content.model.dto.TeachplanDto;
import com.wxy97.content.model.po.Teachplan;

import java.util.List;

/**
 * <p>
 * 课程计划 Mapper 接口
 * </p>
 *
 * @author wxy
 */
public interface TeachplanMapper extends BaseMapper<Teachplan> {

    //查询课程计划(组成树型结构)
    public List<TeachplanDto> selectTreeNodes(Long courseId);
}
