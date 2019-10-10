package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 显示页面
 */
@Controller
public class PageController {
    @RequestMapping("/")
    private String showIndex(){
        return "index";
    }
    /**
     * 显示商品的查询页面
     */
    @RequestMapping("/{page}")
    private String showPage(@PathVariable String page){
        return page;
    }
    @ResponseBody
    @RequestMapping("list")
    private String list(){
        return "";
    }
}
