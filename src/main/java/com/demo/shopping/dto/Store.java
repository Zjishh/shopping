package com.demo.shopping.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * projectName: health
 *
 * @author: 贾瑞超
 * time: 2021/11/9 14:15
 * description:
 */
@Data
public class Store {
    @TableId(type = IdType.AUTO)
    private Integer sid;
    private String sname;
    private Integer uid;
    private  Integer deleted;
}
