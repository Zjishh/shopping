package com.demo.shopping.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;

/**
 * projectName: health
 *
 * @author: 杨玉斌
 * time: 2021/11/4 14:02
 * description:图书
 */
@Data
public class Book {
    @TableId(type = IdType.AUTO)
    private Integer bid;
    private Integer sid;
    private String bname;
    private double price;
    private double fare;
    private String title;
    private String genre;
    private Integer deleted;

    private Store store;
    private List<Picture> pictures;
}
