package com.taotao.controller;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {
    @Autowired(required = false)
    private ItemService itemService;
    @ResponseBody
    @RequestMapping(value = "/item/list",method = RequestMethod.GET)
    public EasyUIDataGridResult getItemList(Integer page,Integer rows){
        //1.引入服务
        //2.注入服务
        //3.调用服务的方法
        return itemService.getItemList(page, rows);
    }
}
