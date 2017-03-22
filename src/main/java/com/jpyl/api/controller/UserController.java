package com.jpyl.api.controller;

import com.jpyl.api.service.def.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/22.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    //这个是第一个接口，测试框架用的
    @ResponseBody
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public Object firstTest(){
        Map map = new HashMap();
        try {
            map.put("result",userService.firstTest());
            map.put("code",1);
            map.put("msg","获取成功");
        }catch (Exception e){
            e.printStackTrace();
            map.put("code",0);//现在返回code统一规范，0表示失败，1表示成功，其他再定义
            map.put("msg","服务器异常");
        }
        return map;
    }
}
