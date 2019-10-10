package com.taotao.controller;
import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试是引用的controller 查询当前的时间
 */
@Controller
public class TestController {

    @Autowired(required = false)
    private TestService testservice;

    @ResponseBody
    @RequestMapping("queryNow")
    public String queryNow(){
        System.out.println("11111111");
      //1.引入服务
        //2.注入服务
        //3.直接调用
        return testservice.queryNow();
    }

}
