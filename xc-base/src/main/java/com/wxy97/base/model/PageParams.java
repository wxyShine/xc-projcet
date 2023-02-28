package com.wxy97.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author wxy
 * @description 分页参数
 * @date 2023/02/28 上午8:57
 * @email wxyrrcj@gmail.com
 */
@Data
@ToString
public class PageParams {

  //当前页码默认值
  public static final long DEFAULT_PAGE_CURRENT = 1L;
  //每页记录数默认值
  public static final long DEFAULT_PAGE_SIZE = 10L;

  @ApiModelProperty("当前页码")
  //当前页码
  private Long pageNo = DEFAULT_PAGE_CURRENT;

  @ApiModelProperty("每页记录数")
  //每页记录数默认值
  private Long pageSize = DEFAULT_PAGE_SIZE;

  public PageParams(){

  }

  public PageParams(long pageNo,long pageSize){
   this.pageNo = pageNo;
   this.pageSize = pageSize;
  }
}
