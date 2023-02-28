package com.wxy97.base.model;

import lombok.Data;
import lombok.ToString;

import java.util.List;
/**
 * @author wxy
 * @description 分页结果
 * @date 2023/02/28 上午8:57
 * @email wxyrrcj@gmail.com
 */
 @Data
 @ToString
public class PageResult<T> {
  // 数据列表
  private List<T> items;

  //总记录数
  private long counts;

  //当前页码
  private long page;

  //每页记录数
  private long pageSize;

  public PageResult(List<T> items, long counts, long page, long pageSize) {
   this.items = items;
   this.counts = counts;
   this.page = page;
   this.pageSize = pageSize;
  }

 }
