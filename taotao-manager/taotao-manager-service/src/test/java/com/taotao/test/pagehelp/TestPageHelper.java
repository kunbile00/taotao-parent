package com.taotao.test.pagehelp;

import com.alibaba.dubbo.container.page.PageHandler;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestPageHelper {
    @Test
    public void testhelper(){
        //1.设置分页信息
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
        //2.初始化spring容器
        TbItemMapper tbItemMapper = (TbItemMapper) applicationContext.getBean(TbItemMapper.class);
        //3.获取Mapper的代理对象\
            //设置查询条件使用
        TbItemExample tbItemExample = new TbItemExample();
        PageHelper.startPage(1,3);//3行 紧跟着的第一个查询才会被分页
        List<TbItem> tbItems1 = tbItemMapper.selectByExample(tbItemExample);
        List<TbItem> tbItems2 = tbItemMapper.selectByExample(tbItemExample);


        //取分页信息
        PageInfo<TbItem> pageInfo = new PageInfo<TbItem>(tbItems1);
        //4.调用mapper的方法查询数据
        System.out.println("第一个分页的List集合的长度"+tbItems1.size());
        System.out.println("第二个分页的List集合的长度"+tbItems2.size());
        //5.遍历结果集 打印
        System.out.println("查询的总记录数"+pageInfo.getTotal());
        for (TbItem tbItem:tbItems1){
            System.out.println(tbItem.getId()+"--"+tbItem.getTitle());
        }


    }
}
