package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.pojo.TbItem;

/**
 * 商品相关的Service接口
 */
public interface ItemService {
    /**
     * 根据当前的页码和每页的行数进行分页查询
     * @param page  页码
     * @param rows  每页行数
     * @return
     */
     EasyUIDataGridResult<TbItem> getItemList(Integer page,Integer rows);
}
