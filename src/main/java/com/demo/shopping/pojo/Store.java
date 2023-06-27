package com.demo.shopping.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * projectName: health
 *
 * @author: 杨玉斌
 * time: 2021/11/4 15:03
 * description:店铺
 */
@Data
public class Store {
    @TableId(type = IdType.AUTO)
    private Integer sid;
    private String sname;
    private Integer uid;
    private  Integer deleted;

    private User user;
}
