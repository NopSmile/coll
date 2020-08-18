package com.itcc.coll.controller;


import com.itcc.coll.entity.JsonData;
import com.itcc.coll.entity.User;
import org.apache.shiro.SecurityUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {


    @RequestMapping("/fill/txt")
    public JsonData fillTxt(){
        return JsonData.buildSuccess("我是填空填空填空");
    }
    @RequestMapping("/fill/txt/query")
    public JsonData fillTxtQuery(){

        User user = (User) SecurityUtils.getSubject().getPrincipal();

        return JsonData.buildSuccess("我是填空填空填空,我在查询填空任务");
    }
    @RequestMapping("/fill/txt/complete")
    public JsonData fillTxtComplete(){
        return JsonData.buildSuccess("我是填空填空填空,我在完成填空任务");
    }



    @RequestMapping("/single/choice")
    public JsonData singleChoice(){
        return JsonData.buildSuccess("我是单选单选单选");
    }
    @RequestMapping("/single/choice/query")
    public JsonData singleChoiceQuery(){
        return JsonData.buildSuccess("我是单选单选单选,我在查询填空任务");
    }
    @RequestMapping("/single/choice/complete")
    public JsonData singleChoiceComplete(){
        return JsonData.buildSuccess("我是单选单选单选,我在完成填空任务");
    }



    @RequestMapping("/down/choice")
    public JsonData downChoice(){
        return JsonData.buildSuccess("我是下拉下拉下拉");
    }
    @RequestMapping("/down/choice/query")
    public JsonData downChoiceQuery(){
        return JsonData.buildSuccess("我是下拉下拉下拉,我在查询填空任务");
    }
    @RequestMapping("/down/choice/complete")
    public JsonData downChoiceComplete(){
        return JsonData.buildSuccess("我是下拉下拉下拉,我在完成填空任务");
    }



    @RequestMapping("/big/txt")
    public JsonData bigTxt(){
        return JsonData.buildSuccess("我是大字段大字段大字段");
    }
    @RequestMapping("/big/txt/query")
    public JsonData bigTxtQuery(){
        return JsonData.buildSuccess("我是大字段大字段大字段,我在查询填空任务");
    }
    @RequestMapping("/big/txt/complete")
    public JsonData bigTxtComplete(){
        return JsonData.buildSuccess("我是大字段大字段大字段,我在完成填空任务");
    }




    @RequestMapping("/multiple/choice")
    public JsonData multipleChoice(){
        return JsonData.buildSuccess("我是多选多选多选");
    }
    @RequestMapping("/multiple/choice/query")
    public JsonData multipleChoiceQuery(){
        return JsonData.buildSuccess("我是多选多选多选,我在查询填空任务");
    }
    @RequestMapping("/multiple/choice/complete")
    public JsonData multipleChoiceComplete(){
        return JsonData.buildSuccess("我是多选多选多选,我在完成填空任务");
    }

}
