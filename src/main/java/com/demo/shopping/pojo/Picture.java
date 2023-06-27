package com.demo.shopping.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Picture {
/**
 * projectName: shopping
 * @author: 肖学桐
 * time: 2021/11/4 11:04
 * description:
 */
  @TableId(type = IdType.AUTO)
  private Integer pid;
  private Integer bid;
  private String url;
  private Integer deleted;
}
