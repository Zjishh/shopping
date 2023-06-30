package com.demo.shopping.controller;

import com.demo.shopping.pojo.Book;
import com.demo.shopping.pojo.Picture;
import com.demo.shopping.service.PictureService;
import com.demo.shopping.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/picture")
public class PictureController {

@Autowired
    private PictureService pictureService;
@GetMapping("list")
    public Object list(Picture picture){
    R r=pictureService.list(picture);
    return r;
}
    @PostMapping("add")
    public Object save(@RequestBody Picture picture){
        R r=pictureService.add(picture);
        return r;
    }
    @GetMapping("delete")
    public Object delete(int bid){
    R r=pictureService.delete(bid);
    return r;
    }
}
