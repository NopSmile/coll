package com.itcc.coll.controller;


import com.itcc.coll.entity.JsonData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {


    @RequestMapping("/fill/txt")
    public JsonData fillTxt(){

        return JsonData.buildSuccess("我是填空填空填空");

    }

    @RequestMapping("/single/choice")
    public JsonData singleChoice(){

        return JsonData.buildSuccess("我是单选单选单选");

    }

    @RequestMapping("/down/choice")
    public JsonData downChoice(){

        return JsonData.buildSuccess("我是下拉下拉下拉");

    }


    @RequestMapping("/big/txt")
    public JsonData bigTxt(){

        return JsonData.buildSuccess("我是大字段大字段大字段");

    }
    @RequestMapping("/multiple/choice")
    public JsonData multipleChoice(){

        return JsonData.buildSuccess("我是多选多选多选");

    }
}
