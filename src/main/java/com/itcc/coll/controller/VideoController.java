package com.itcc.coll.controller;


import com.itcc.coll.entity.JsonData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("video")
public class VideoController {


    @RequestMapping("/update")
    public JsonData updateVideo(){

        return JsonData.buildSuccess("video更新成功");

    }

    @RequestMapping("/delete")
    public JsonData deleteVideo(){

        return JsonData.buildSuccess("video删除成功");

    }
}
