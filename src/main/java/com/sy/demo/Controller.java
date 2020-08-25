package com.sy.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){

        return "index.jsp";
    }
}
