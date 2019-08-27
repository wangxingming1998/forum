package com.t98k.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author sa
 * @date 2019/8/26
 * @description
 */
@Controller
public class IndexController {

    @GetMapping("/login")
    public String hello(){
        return "login";
    }

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code")String code, @RequestParam(name = "state")String state){
        return "callback";
    }

}
